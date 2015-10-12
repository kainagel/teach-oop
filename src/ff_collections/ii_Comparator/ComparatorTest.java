package ff_collections.ii_Comparator;

import java.util.*;

import ff_collections.hh_Comparable.Agent;


class ComparatorTest
{
	public static void main ( String[] args ) {
		List<Agent> agents = new ArrayList<Agent>() ;
		
//		System.out.println ( "\ngenerate agents with random id/age ..." ) ;
		for ( int ii=0 ; ii<5 ; ii++ ) {
			double age = Math.random();
			int id = (int)(100000.*Math.random());
			Agent ag = new Agent ( id, age ) ;
			agents.add(ag) ;
		}
		
//		System.out.println ( "\ndemonstrate that id/age are in rnd sequence: " ) ;
//		for ( Agent ag : agents ) {
//			System.out.println ( " agentId: " + ag.getId() + " age: " + ag.getAge() ) ;
//		}

//		System.out.println ( "\nsort the agents ..." ) ;
//		Collections.sort( agents ) ;

//		System.out.println ( "\nsort the agents according to CMP ..." ) ;
		IdComparator c = new IdComparator();
		Collections.sort( agents, c ) ;
//
//		System.out.println ( "\nprint out the agents: " ) ;
		for ( Agent ag : agents ) {
			System.out.println ( " id: " + ag.getId() + " age: " + ag.getAge() ) ;
		}

	}
}
