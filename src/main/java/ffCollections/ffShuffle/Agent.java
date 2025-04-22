package ffCollections.ffShuffle;

class Agent implements Comparable<Agent> {
	private long id ;
	public Agent ( int ii ) {
		this.id = ii ;
	}
	public long getId() {
		return this.id ;
	}

	@Override public int compareTo( Agent other ){

		if ( this.id > other.id ) {
			return +1;
		} else if (this.id == other.id ) {
			return 0;
		} else {
			return -1;
		}



	}
}
