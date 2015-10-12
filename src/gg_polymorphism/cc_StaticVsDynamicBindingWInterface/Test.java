package gg_polymorphism.cc_StaticVsDynamicBindingWInterface;

class Test {
	
	static void aMethod( Person person ) {
		System.out.println( " calling Person method on person " + person.getId() );
	}
	static void aMethod( AgentI agent ) {
		System.out.println( " calling AgentI method on agent " + agent.getId() );
	}

	public static void main( String[] args ) {
		
		AgentI mueller = new Person(1) ;

		mueller.move(); // calling Person move method (polymorphism, dynamic binding)

		aMethod( mueller ) ; // calling AgentI version of aMethod !!!! (static binding) 
		
//		Person muellerAsPerson = (Person) mueller ;
//		aMethod( muellerAsPerson ) ;

	}

}
