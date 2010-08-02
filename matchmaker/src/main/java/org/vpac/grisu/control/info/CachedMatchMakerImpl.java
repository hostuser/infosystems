package org.vpac.grisu.control.info;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;

import au.org.arcs.jcommons.constants.JobSubmissionProperty;
import au.org.arcs.jcommons.interfaces.GridResource;
import au.org.arcs.jcommons.interfaces.MatchMaker;
import au.org.arcs.jcommons.interfaces.RankingAlgorithm;

public class CachedMatchMakerImpl implements MatchMaker {
	
	private final MatchMakerImpl nonCached;
	
	private Map<String, List<GridResource>> cacheMap = new HashMap<String, List<GridResource>>();
	
	public CachedMatchMakerImpl(String mdsCacheDirectory) {
		this.nonCached = new MatchMakerImpl(mdsCacheDirectory);
	}

	private List<GridResource> findMatchingResources(
			Map<JobSubmissionProperty, String> jobProperties, String fqan, boolean excludeResourcesWithLessCPUslotsFreeThanRequested) {
		
		StringBuffer key = new StringBuffer(fqan);
		
		JobSubmissionProperty[] properties = jobProperties.keySet().toArray(new JobSubmissionProperty[]{});
		for ( JobSubmissionProperty prop : properties ) {
			key.append(jobProperties.get(prop));
		}
		
		key.append(excludeResourcesWithLessCPUslotsFreeThanRequested);
		
		List<GridResource> result = cacheMap.get(key.toString());
		if ( result == null ) {
			result = nonCached.findMatchingResources(jobProperties, fqan, excludeResourcesWithLessCPUslotsFreeThanRequested);
			cacheMap.put(key.toString(), result);
		}
		return result;
	}

	public List<GridResource> findAvailableResources(Document jsdl, String fqan) {

		return findMatchingResources(MatchMakerImpl.generatePropertiesMap(jsdl), fqan, true);
		
	}
	
	public List<GridResource> findAvailableResources(
			Map<JobSubmissionProperty, String> jobProperties, String fqan) {
		return findMatchingResources(jobProperties, fqan, true);
	}
	
	public void setRankingAlgorithm(RankingAlgorithm rankingAlgorithm) {

			nonCached.setRankingAlgorithm(rankingAlgorithm);
	}

	public List<GridResource> findAllResources(
			Map<JobSubmissionProperty, String> jobProperties, String fqan) {
		
		return findMatchingResources(jobProperties, fqan, false);
	}

	public List<GridResource> findAllResources(Document jsdl, String fqan) {
		return findMatchingResources(MatchMakerImpl.generatePropertiesMap(jsdl), fqan, false);
	}



			


}
