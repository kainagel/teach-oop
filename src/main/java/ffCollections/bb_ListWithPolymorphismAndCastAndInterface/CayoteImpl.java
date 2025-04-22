package ffCollections.bb_ListWithPolymorphismAndCastAndInterface;
class CayoteImpl implements AgentI, CanHowlI {

	private int id ;

	@Override
	public int getId() {
		return this.id ;
	}

	public CayoteImpl( int ii ) {
		this.id = ii ;
	}
	
	@Override
	public void howl() {
		System.out.println( "Cayote with ID=" + this.id + " is howling." );
	}

}
