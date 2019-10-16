package ffCollections.cc_SetAndQueue;

import java.util.*;

class SetMain {

	public static void main(String[] args) {

		//    	Set<Agent> agents = new ArrayList<>() ;
//		Set<Agent> agents = new HashSet<>() ;
		    	Set<Agent> agents = new TreeSet<>() ;

		for ( int ii=10 ; ii>=0; ii-- ) {
			Agent ag = new Agent(ii) ;
			agents.add ( ag ) ;
		}

		Agent ag2 = new Agent(11) ;
		boolean flag = agents.add( ag2 ) ;
		System.out.println( " flag1: " + flag ) ;

		flag = agents.add( ag2 ) ;
		System.out.println( " flag2: " + flag ) ;

		flag = agents.add( ag2 ) ;
		System.out.println( " flag3: " + flag ) ;

		for ( Agent ag : agents ) {
			System.out.println ( " this is agent w/ Id: " + ag.getId() ) ;
		}


	}
}
