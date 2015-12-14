package ff_collections.hh_Comparable;

import java.util.* ;


class ComparableTest
{
	public static void main ( String[] args ) {
		List<Agent> agents = new ArrayList<Agent>() ;
		
		System.out.println ( "\ngenerate agents with random id/age ..." ) ;
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Agent ag = new Agent ( (int)(100000.*Math.random()), Math.random() ) ;
			agents.add(ag) ;
		}
		
		System.out.println ( "\ndemonstrate that id is in rnd sequence: " ) ;
		for ( Agent ag : agents ) {
			System.out.println ( " agentId: " + ag.getId() + " agentAge: " + ag.getAge() ) ;
		}

		System.out.println ( "\nsort the agents ... " ) ;
		Collections.sort( agents ) ;

		System.out.println ( "\ndemonstrate that they are now sorted: " ) ;
		for ( Agent ag : agents ) {
			System.out.println ( " agentId: " + ag.getId() + " agentAge: " + ag.getAge() ) ;
		}
	}
}
