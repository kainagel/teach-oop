package ffCollections.bb_ListWithPolymorphism;

import java.util.*;


class Main {
	public static void main(String[] args) {

		List<AgentI> agents = new ArrayList<>() ;
//		List<AgentI> agents = new LinkedList<>() ;

		for ( int ii=1 ; ii<=5; ii++ ) {
			AgentI ag = new Person(ii) ;
			agents.add ( ag ) ;
		}
		for ( int ii=1 ; ii<=5; ii++ ) {
			Dog ag = new Dog(ii) ;
			agents.add ( ag ) ;
		}
		
		AgentI ag1 = agents.get(3); 

		for ( AgentI ag : agents ) {
			System.out.println( " this is agent w/ Id: " + ag.getId() ) ;
		}

	}
}














