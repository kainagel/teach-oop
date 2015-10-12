package gg_polymorphism.cc_StaticVsDynamicBindingWInterface;
class Person implements AgentI {
	private int id ;
	Person( int id ) {
		this.id = id ;
	}
	@Override
	public int getId() {
		return id ;
	}
	@Override
	public void move () {
		System.out.println ( " Person move method on person " + id ) ;
	}
}
