package au.org.arcs.grid.sched;

import org.vpac.grisu.model.GridResource;

public interface RankingAlgorithm {
	
	public int getRank(GridResource gridResource);

}
