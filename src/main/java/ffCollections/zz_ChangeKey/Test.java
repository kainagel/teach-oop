package ffCollections.zz_ChangeKey;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Test
{
    static final Comparator CMP = new Cmp() ;

    public static void main ( String[] args ) 
    {
	PriorityQueue pQueue = new PriorityQueue( 30, CMP ) ;
 	List list = new ArrayList() ;

// 	Agent ag5 = null ;

	for ( int ii=10 ; ii>0 ; ii-- ) {
	    Agent ag = new Agent() ;
	    ag.setAge( ii ) ;
	    pQueue.add( ag ) ;
 	    list.add( ag ) ;
	}

 	Agent agg = (Agent) list.get(5) ;
 	agg.setAge( 3.3 ) ;
 
	for ( int ii=10 ; ii>0 ; ii-- ) {
	    Agent ag = (Agent) pQueue.poll() ;
	    System.out.println ( " age: " + ag.getAge() ) ;
	}


    }
}
