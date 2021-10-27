package ffCollections.bb_ListTest;
class Agent {
	private int id ;
	
	public int getId() {
		return this.id ;
	}

	public Agent ( int ii ) {
		this.id = ii ;
	}

	@Override
	public String toString() {
		return "agent with id=" + id;
	}

	void doSomething() {
		System.out.println( "doing something with agent with id=" + id ) ;
	}

}
