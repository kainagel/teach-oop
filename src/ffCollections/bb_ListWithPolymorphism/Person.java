package ffCollections.bb_ListWithPolymorphism;
class Person implements AgentI {

	private int id ;

	@Override
	public int getId() {
		return this.id ;
	}

	public Person ( int ii ) {
		this.id = ii ;
	}
	
	public void talk() {
		System.out.println( "Person with ID=" + this.id + " is talking." );
	}

}