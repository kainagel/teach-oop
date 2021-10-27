package ffCollections.hh_Comparable;

import java.util.* ;


class ComparableTest
{
	public static void main ( String[] args ) {
//		Collection<Agent> agents = new ArrayList<>() ;
		SortedSet<Agent> agents = new TreeSet<>();

		generateAgents(agents);
		
//		System.out.println ( "\ndemonstrate that id is in rnd sequence: " ) ;
		printAllAgents(agents);

//		System.out.println ( "\nsort the agents ... " ) ;
//		Collections.sort( agents ) ;

		System.out.println ( "\ndemonstrate that they are now sorted: " ) ;
		printAllAgents(agents);
	}

	private static void printAllAgents(Collection<Agent> agents) {
		for ( Agent ag : agents ) {
			System.out.println ( " agentId: " + ag.getId() + " agentAge: " + ag.getAge() ) ;
		}
	}

	private static void generateAgents(Collection<Agent> agents) {
		System.out.println ( "\ngenerate agents with random id/age ..." ) ;
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Agent ag1 = new Agent ( (int)(100000.*Math.random()), Math.random() ) ;
			agents.add(ag1) ;
		}
	}
}
