package ffCollections.bb_ListTest;

import java.util.*;


class Main {
	public static void main(String[] args) {

		List agents = new ArrayList<>() ;
//		List<AgentImpl> agents = new LinkedList<>() ;

		for ( int ii=1 ; ii<=5; ii++ ) {
			Agent ag = new Agent(ii) ;
			agents.add ( ag ) ;
		}
//		agents.add( new Agent(2020) ) ;
//		agents.add( new Object() ) ;
		
		Table table = new Table() ;
		agents.add(table) ;

//		Agent agTmp = agents.get(4) ;
		
//		System.out.println ( " agTmp.Id: " + agTmp.getId() ) ;

//		agents.remove(3) ;
//
//		agTmp = agents.get(5) ;
//		System.out.println ( " agTmp.Id: " + agTmp.getId() ) ;
//
		System.out.println( " size: " + agents.size() ) ;
		
		for (   Object aa : agents ) {
			Agent ag = (Agent) aa ;
			System.out.println( " this is agent w/ Id: " + ag.getId() ) ;
		}

	}
}














