package ff_collections.bb_ListTest;
public class Agent implements Comparable<Agent>{
	private int id ;
	public int getId() {
		return this.id ;
	}

	public Agent ( int ii ) {
		this.id = ii ;
	}
	@Override
	public int compareTo(Agent other) {
		if ( this.id > other.getId() ) {
			return -1 ;
		} else if ( this.id == other.getId() ) {
			return 0 ;
		} else {
			return 1 ;
		}

	}


}