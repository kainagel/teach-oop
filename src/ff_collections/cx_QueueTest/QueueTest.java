package ff_collections.cx_QueueTest;

import java.util.*;

import ff_collections.bb_ListTest.Agent;

public class QueueTest {

    public static void main(String[] args) {

    	Queue<Agent> agents = new PriorityQueue<>() ;
    	
//    	agents.remove();
    	
    	agents.poll();
    	
    	for ( int ii=0 ; ii<10; ii++ ) {
    	    Agent ag = new Agent(ii) ;
    	    agents.add ( ag ) ;
    	}
    	
    	Agent ag2 ; 
    	ag2 = agents.peek() ;
    	agents.remove() ;
    	System.out.println( " this is agent w/ Id: " + ag2.getId() ) ;
    	ag2 = agents.peek() ;
    	System.out.println( " this is agent w/ Id: " + ag2.getId() ) ;
    	
    }
}
