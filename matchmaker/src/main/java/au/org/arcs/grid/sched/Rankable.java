package au.org.arcs.grid.sched;

public interface Rankable {
	
	public abstract int getRank();
	
	public abstract void setRankingAlgorithm(RankingAlgorithm rankingAlgorithm);

}
