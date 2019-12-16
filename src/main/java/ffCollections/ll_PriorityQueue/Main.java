package ffCollections.ll_PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

class Main{

	public static void main( String[] args ){

		Queue<String> queue = new PriorityQueue<>()  ;

		queue.add( "Pedelec" ) ;
		queue.add( "Fahrrad" ) ;
		queue.add( "Scooter" ) ;

		System.out.println( queue.peek() );
		System.out.println( queue.element() );

		queue.add( "Auto" ) ;

		System.out.println( queue.peek() );

		queue.add( "Zug" ) ;

		System.out.println( queue.peek() );

		String removed = queue.poll();

		System.out.println( "removed=" + removed );

		System.out.println( queue.peek() );


	}

}
