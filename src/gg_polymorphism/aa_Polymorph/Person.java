package gg_polymorphism.aa_Polymorph;
class Person implements AgentI {

	@Override
	public void move(int ii) {
		System.out.println ( " Person move method on person " ) ;
	}

	public void think() {
		System.out.println ( " Person is thinking " ) ;
	}

}
