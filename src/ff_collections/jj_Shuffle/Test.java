package ff_collections.jj_Shuffle;

import java.util.*;

public class Test {
	
	private static void printAllAgentIds(List<Agent> agents) {
		for ( Agent ag : agents ) {
			System.out.print ( ag.getId() + " " ) ;
		}
		System.out.println() ;
	}

	public static void main ( String[] args ) {
		List<Agent> agents = new ArrayList<Agent>() ;

		for ( int ii=0 ; ii<10 ; ii++ ) {
			Agent ag = new Agent(ii) ;
			agents.add( ag ) ;
		}
		printAllAgentIds(agents) ;
		
		List<Agent> copy = new LinkedList<>(agents) ;
		
		Random rnd = new Random(4713) ;
		Collections.shuffle(agents,rnd) ;
		printAllAgentIds(agents) ;

//		rnd.setSeed(4713);
//		Collections.shuffle(agents,rnd) ;
//		printAllAgentIds(agents) ;

		rnd.setSeed(4713);
		Collections.shuffle(copy,rnd) ;
		printAllAgentIds(copy) ;

	}
}
