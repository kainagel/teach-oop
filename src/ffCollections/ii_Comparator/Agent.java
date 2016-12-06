package ffCollections.ii_Comparator;

public class Agent implements Comparable<Agent> 
{
	private int id_ ;
	public int getId() { return id_ ; }

	private double age_ ;
	public  double getAge() { return age_ ; }

	public Agent ( int id, double age ) { id_ = id ; age_ = age ; }

	@Override
	public int compareTo ( Agent otherAgent ) {
		if ( this.getId() < otherAgent.getId() ) {
			return -1; 
		} else if ( this.getId() == otherAgent.getId() ) {
			return 0 ;
		} else {
			return 1 ; 
		}
	}
}
