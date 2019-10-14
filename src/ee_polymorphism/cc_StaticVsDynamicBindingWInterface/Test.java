package ee_polymorphism.cc_StaticVsDynamicBindingWInterface;

class Test {

	public static void main(String[] args) {
		AgentI mueller = new Adult();
		
		mueller.aMethod(); // dynamic binding
		
		aMethod(mueller); // static binding
	}
	
	static void aMethod( AgentI agent){
		System.out.println("calling AgentI method");
	}
	
	static void aMethod( Adult person){
		System.out.println("calling Adult method");
	}

}
