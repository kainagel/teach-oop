package ffCollections.hh_Comparable;

public class Agent implements Comparable<Agent>
{
	private int id_ ;
	public int getId() { return id_ ; }

	private double age_ ;
	public  double getAge() { return age_ ; }

	public Agent ( int id, double age ) { id_ = id ; age_ = age ; }

	@Override
	public int compareTo(Agent o) {
		if ( this.getAge() < o.getAge() ) { 
			return -1 ;
		} else if ( this.getAge() == o.getAge() ) {
			return 0 ;
		} else {
			return 1 ;
		}
	}

}
