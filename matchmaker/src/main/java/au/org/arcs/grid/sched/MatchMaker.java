package au.org.arcs.grid.sched;

import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;

import au.org.arcs.mds.GridResource;
import au.org.arcs.mds.JobSubmissionProperty;

public interface MatchMaker {
	
	
	
	public abstract List<GridResource> findMatchingResources(Map<JobSubmissionProperty, String> jobProperties, String fqan);
	
	public abstract List<GridResource> findMatchingResources(Document jsdl, String fqan);
	
	public abstract void setRankingAlgorithm(RankingAlgorithm rankingAlgorithm);

}
