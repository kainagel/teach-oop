package ffCollections.ii_Comparator;

import java.util.*;

class ComparatorTest
{
	public static void main ( String[] args ) {
		List<Agent> agents = new ArrayList<>() ;

		generateAgents( agents );

		System.out.println ( "\ndemonstrate that id/age are in rnd sequence: " ) ;
		printAllAgents(agents);

		System.out.println ( "\nsort the agents according to comparator ..." ) ;

		Comparator<Agent> cmp = new MyComparator();
		Collections.sort( agents, cmp );

		System.out.println ( "\nprint out the agents: " ) ;
		printAllAgents(agents) ;

	}

	private static void generateAgents( List<Agent> agents ){
		System.out.println ( "\ngenerate agents with random id/age ..." ) ;
		for ( int ii=0 ; ii<5 ; ii++ ) {
			double age = Math.random();
			int id = (int)(100000.*Math.random());
			Agent ag = new Agent ( id, age ) ;
			agents.add(ag) ;
		}
	}

	private static void printAllAgents(List<Agent> agents) {
		for ( Agent ag : agents ) {
			System.out.println ( " agentId: " + ag.getId() + " age: " + ag.getAge() ) ;
		}
	}
}
