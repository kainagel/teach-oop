package gg_polymorphism.aa_Polymorph;
class Dog implements AgentI {

	@Override
	public void move(int ii) {
		System.out.println ( " dog move method on dog " ) ;
	}

	public void bark () {
		System.out.println( " dog BARK method on dog " ) ;
	}
	
}
