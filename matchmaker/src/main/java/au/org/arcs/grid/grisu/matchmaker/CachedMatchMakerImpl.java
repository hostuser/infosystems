package au.org.arcs.grid.grisu.matchmaker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;

import au.org.arcs.grid.sched.MatchMaker;
import au.org.arcs.grid.sched.RankingAlgorithm;
import au.org.arcs.jcommons.constants.JobSubmissionProperty;
import au.org.arcs.jcommons.interfaces.GridResource;

public class CachedMatchMakerImpl implements MatchMaker {
	
	private final MatchMaker nonCached;
	
	private Map<String, List<GridResource>> cacheMap = new HashMap<String, List<GridResource>>();
	
	public CachedMatchMakerImpl(String mdsCacheDirectory) {
		this.nonCached = new MatchMakerImpl(mdsCacheDirectory);
	}

	public List<GridResource> findMatchingResources(
			Map<JobSubmissionProperty, String> jobProperties, String fqan) {
		
		StringBuffer key = new StringBuffer(fqan);
		
		JobSubmissionProperty[] properties = jobProperties.keySet().toArray(new JobSubmissionProperty[]{});
		for ( JobSubmissionProperty prop : properties ) {
			key.append(jobProperties.get(prop));
		}
		
		List<GridResource> result = cacheMap.get(key.toString());
		if ( result == null ) {
			result = nonCached.findMatchingResources(jobProperties, fqan);
			cacheMap.put(key.toString(), result);
		}
		return result;
	}

	public List<GridResource> findMatchingResources(Document jsdl, String fqan) {

		return findMatchingResources(MatchMakerImpl.generatePropertiesMap(jsdl), fqan);
		
	}

	public void setRankingAlgorithm(RankingAlgorithm rankingAlgorithm) {

			nonCached.setRankingAlgorithm(rankingAlgorithm);
	}
	

			


}
