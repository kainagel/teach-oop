package ffCollections.hh_Comparable;

class Agent
implements Comparable<Agent>
{
	private int id_ ;
	public int getId() { return id_ ; }

	private double age_ ;
	public  double getAge() { return age_ ; }

	private String lastName ;
	private String firstName;

	public Agent ( int id, double age ) { id_ = id ; age_ = age ; }

	@Override
	public int compareTo(Agent other) {
		if ( this.getId() < other.getId() ) {
			return -1 ;
		} else if (this.getId() == other.getId() ) {
			return 0 ;
		} else {
			return 1 ;
		}
	}

//	@Override
//	public int compareTo(Agent o) {
//		if ( this.getAge() < o.getAge() ) {
//			return -1 ;
//		} else if ( this.getAge() == o.getAge() ) {
//			return 0 ;
//		} else {
//			return 1 ;
//		}
//	}

}
