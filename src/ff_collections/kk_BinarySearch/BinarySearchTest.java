package ff_collections.kk_BinarySearch;

import java.util.*;


class BinarySearchTest 
{

	public static void main ( String[] args ) 
	{
		System.out.println( "\n generate agents and add into List:" ) ;
		List<Agent> agents = new ArrayList<>() ;
		for ( int ii=208; ii>=200 ; ii = ii - 2 ) {
			Agent ag = new Agent ( ii ) ;
			agents.add ( ag ) ;
			ag.setAge( Math.random() ) ;
		}

		System.out.println( "\n print out agents in their original sequence:" ) ;
		for ( int ii=0 ; ii<agents.size() ; ii++ ) {
			Agent ag = agents.get(ii) ;
			System.out.println ( " ii: " + ii + " id: " + ag.getId() + " age: " + ag.getAge() ) ;
		}

//		System.out.println( "\n try to get existing agent with id via binary search" ) ;
//		int jj = Collections.binarySearch( agents, new Agent(206) ) ;
//		Agent theAgent = agents.get(jj) ;
//		System.out.println ( "\n theAgent has Id: " + theAgent.getId() + " age: " + theAgent.getAge() ) ;

		System.out.println( "\n sort the agents:" ) ;
		Collections.sort( agents ) ;

		System.out.println( "\n print out agents in new (sorted) physical sequence:" ) ;
		for ( int ii=0 ; ii<agents.size() ; ii++ ) {
			Agent ag = agents.get(ii) ;
			System.out.println ( " ii: " + ii + " id: " + ag.getId() + " age: " + ag.getAge() ) ;
		}

		System.out.println( "\n get existing agent with id via binary search" ) ;
		Agent keyAgent = new Agent(206);
		int ii = Collections.binarySearch( agents, keyAgent ) ;
		Agent theAgent2 = agents.get(ii) ;
//		Agent theAgent2 = keyAgent ;
		System.out.println ( "\n theAgent has Id: " + theAgent2.getId() + " age: " + theAgent2.getAge() ) ;
	}
}
