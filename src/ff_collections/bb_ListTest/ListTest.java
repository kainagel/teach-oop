package ff_collections.bb_ListTest;

import java.util.*;


public class ListTest {
	public static void main(String[] args) {

		List<Agent> agents = new LinkedList<>() ;

		for ( int ii=1 ; ii<=10; ii++ ) {
			Agent ag = new Agent(ii) ;
			agents.add ( ag ) ;
		}
		agents.add( new Agent(2020) ) ;
//		agents.add( new Object() ) ;

		Agent agTmp = agents.get(5) ;
		System.out.println ( " agTmp.Id: " + agTmp.getId() ) ;

		agents.remove(5) ;

		agTmp = agents.get(5) ;
		System.out.println ( " agTmp.Id: " + agTmp.getId() ) ;

		System.out.println( " size: " + agents.size() ) ;
		
		for ( Agent ag : agents ) {
			System.out.println( " this is agent w/ Id: " + ag.getId() ) ;
		}

	}
}














