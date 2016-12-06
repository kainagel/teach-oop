package ffCollections.bb_ListWithPolymorphismAndCastAndInterface;
class Person implements AgentI, CanTalkI {

	private int id ;

	@Override
	public int getId() {
		return this.id ;
	}

	public Person ( int ii ) {
		this.id = ii ;
	}
	
	@Override
	public void talk() {
		System.out.println( "Person with ID=" + this.id + " is talking." );
	}

}