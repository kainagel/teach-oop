package hh_inheritanceFurtherDetails.cc_StaticVsDynamicBindingWInterface;

class Adult implements AgentI{

	@Override public void move(){
		System.out.println("Adult move method");
	}

	void speak() {
		System.out.println( "Adult speak method");
	}
	
}
