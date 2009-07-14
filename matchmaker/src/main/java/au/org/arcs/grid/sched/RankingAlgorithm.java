package au.org.arcs.grid.sched;

import org.vpac.grisu.model.info.GridResource;

public interface RankingAlgorithm {
	
	public int getRank(GridResource gridResource);

}
