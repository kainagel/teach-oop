package ffCollections.ll_PriorityQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Main{

	public static void main( String[] args ){

		Queue<String> queue = new PriorityQueue<>()  ;
//		Queue<String> queue = new LinkedList<String>();

		queue.add( "Pedelec" ) ;
		queue.add( "Fahrrad" ) ;
		queue.add( "Scooter" ) ;

		System.out.println( queue.peek() );
		System.out.println( queue.element() );

		queue.add( "Auto" ) ;
		queue.add( "Bus" ) ;

		System.out.println( queue.peek() );

		queue.add( "Zug" ) ;

		System.out.println( queue.peek() );

		String removed = queue.remove();

		System.out.println( "removed=" + removed );

		System.out.println( queue.peek() );


	}

}
