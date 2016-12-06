package ffCollections.bb_ListWithPolymorphismAndCastAndInterface;
class Dog implements AgentI, CanHowlI {

	private int id ;

	@Override
	public int getId() {
		return this.id ;
	}

	public Dog ( int ii ) {
		this.id = ii ;
	}
	
	@Override
	public void howl() {
		System.out.println( "Dog with ID=" + this.id + " is howling." );
	}

}