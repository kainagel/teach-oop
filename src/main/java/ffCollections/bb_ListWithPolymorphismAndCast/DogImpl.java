package ffCollections.bb_ListWithPolymorphismAndCast;
class DogImpl implements AgentI {

	private int id ;

	@Override
	public int getId() {
		return this.id ;
	}

	public DogImpl( int ii ) {
		this.id = ii ;
	}
	
	public void howl() {
		System.out.println( "Dog with ID=" + this.id + " is howling." );
	}

}
