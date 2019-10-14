package ffCollections.bb_ListTest;

import java.util.*;


class Main {
	public static void main(String[] args) {

		List<Agent> agents = new LinkedList() ;

		for ( int ii=1 ; ii<=5; ii++ ) {
			Agent ag = new Agent(ii) ;
			agents.add( ag ) ;
		}
		
//		agents.add("bc") ;
		
		for ( Object agent : agents ) {
			System.out.println( ((Agent)agent).getId() );
		}
		
//		for ( Agent agent : agents ) {
//			System.out.println(  agent.getId() ) ;
//			if ( agent.getId()==2 ) {
//				agents.remove( agent) ;
//			}
//		}
		
//		for ( Iterator it = agents.iterator() ; it.hasNext() ; ) {
//			Agent agent =(Agent) it.next() ;
//			System.out.println(  agent.getId() ) ;
//			if ( agent.getId()==2 ) {
//				it.remove();
//			}
//		}
		
//		for ( Agent agent : agents ) {
//			System.out.println( agent.getId() ) ;
//		}
		
//		agents.add( new Agent(2020) ) ;
//		agents.add( new Object() ) ;
		
//		Table table = new Table() ;
//		agents.add(table) ;

//		Agent agTmp = agents.get(4) ;
//		System.out.println ( " agTmp.Id: " + agTmp.getId() ) ;
//
//		agents.remove(3) ;
//
//		agTmp = agents.get(3) ;
//		System.out.println ( " agTmp.Id: " + agTmp.getId() ) ;
//		
//		agents.set(2,  new Agent(22) ) ;
//		
//		System.out.println( "pos 2=" + agents.get(2).getId() ) ;
//		System.out.println( "pos 3=" + agents.get(3).getId() ) ;
		

//		System.out.println( " size: " + agents.size() ) ;
//		
//		for (   Object aa : agents ) {
//			Agent ag = (Agent) aa ;
//			System.out.println( " this is agent w/ Id: " + ag.getId() ) ;
//		}

	}
}














