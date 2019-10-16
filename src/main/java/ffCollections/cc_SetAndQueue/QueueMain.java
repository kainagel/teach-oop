package ffCollections.cc_SetAndQueue;

import java.util.*;

public class QueueMain {

    public static void main(String[] args) {

    	Queue<Agent> agents = new PriorityQueue<>() ;
    	
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
