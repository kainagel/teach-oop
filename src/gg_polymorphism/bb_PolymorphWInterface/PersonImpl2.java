package gg_polymorphism.bb_PolymorphWInterface;
class PersonImpl2 implements AgentI {
	private int id ;
	PersonImpl2( int id ) {
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
	
}
