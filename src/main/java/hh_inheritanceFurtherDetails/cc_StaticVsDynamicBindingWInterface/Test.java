package hh_inheritanceFurtherDetails.cc_StaticVsDynamicBindingWInterface;

class Test {

	public static void main(String[] args){
		AgentI mueller = new Adult();

		callSubroutine( mueller );
	}

	static void aMethod( AgentI agent){
		System.out.println("calling AgentI method");
	}

	static void aMethod( Adult person){
		System.out.println("calling Adult method");
	}














	static void callSubroutine( AgentI agent ) {

		agent.move(); // dynamic binding

		aMethod( agent );

		Adult adult = (Adult) agent;

		aMethod( adult ); // static binding

	}
	
}
