package gg_polymorphism.bb_PolymorphWInterface;
class PersonImpl implements AgentI, CanSpeak {
	private int id ;
	PersonImpl( int id ) {
		this.id = id ;
	}
	@Override
	public int getId() {
		return id ;
	}
	@Override
	public void move () {
		System.out.println ( " Person move method on person ") ;
	}
	
	@Override
	public void speak () {
		System.out.println ( " Person is speaking " ) ;
	}

}
