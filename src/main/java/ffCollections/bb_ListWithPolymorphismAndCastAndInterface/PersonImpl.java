package ffCollections.bb_ListWithPolymorphismAndCastAndInterface;
class PersonImpl implements AgentI, CanTalkI {

	private int id ;

	@Override
	public int getId() {
		return this.id ;
	}

	public PersonImpl( int ii ) {
		this.id = ii ;
	}
	
	@Override
	public void talk() {
		System.out.println( "Person with ID=" + this.id + " is talking." );
	}

}
