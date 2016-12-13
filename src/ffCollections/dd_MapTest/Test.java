package ffCollections.dd_MapTest;

import java.util.*;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {

		Map<String,Agent> agents = new HashMap<>() ;

		{
			Agent ag1 = new Agent(10) ;
			Agent ag2 = new Agent(20) ;
			Agent ag3 = new Agent(30) ;
			
			agents.put( "blabla", ag1 ) ;
			agents.put( "1044", ag2 ) ;
			agents.put( "1045", ag3 ) ;
		}
		
		for ( Agent ag : agents.values() ) {
			System.out.println( ag ) ;
		}
		
//		for ( String str : agents.keySet() ) {
//			System.out.println( str ) ;
//		}
		
//		for ( Entry<String, Agent> ee : agents.entrySet() ) {
//			System.out.println( "getKey: " + ee.getKey() );
//			System.out.println( "getValue: " + ee.getValue() );
//		}
		
//		for ( Map.Entry entry : agents.entrySet() ) {
//			System.out.println( "key: " + entry.getKey() ) ;
//			System.out.println( "value: " + entry.getValue() ) ;
////			Agent ag = (Agent) entry.getValue() ;
////			System.out.println( " agent: " + ag ) ;
//		}
		
		
//		for ( Iterator it = agents.values().iterator() ; it.hasNext() ; ) {
//			Agent ag = (Agent) it.next();
//			System.out.println( " age: " + ag.getAge() ) ;
//		}

//		Agent ag3 = (Agent) agents.get("blabla") ;
//		if ( ag3==null ) { 
//			System.err.println( " could not find agent ") ;
//		} else {
//			System.out.println ( " age: " + ag3.getAge() ) ;
//		}
//
//		for ( Iterator it = agents.entrySet().iterator() ; it.hasNext() ; ) {
//			Map.Entry e = (Map.Entry) it.next() ;
//			System.out.println ( " key: " + e.getKey() + "; value: " + e.getValue() ) ;
//			
//			Agent ag = (Agent) e.getValue() ;
//			System.out.println ( " age: " + ag.getAge() ) ;
//		}
//		
//		for ( Iterator it = agents.keySet().iterator(); it.hasNext() ; ) {
//			String key = (String) it.next();
//			System.out.println( " key: " + key ) ;
//			if ( key.equals("1044") ) {
//				it.remove() ;
//			}
//		}
//		
//		System.out.println();
//		
//		for ( Iterator it = agents.entrySet().iterator() ; it.hasNext() ; ) {
//			Map.Entry e = (Map.Entry) it.next() ;
//			System.out.println ( " key: " + e.getKey() + "; value: " + e.getValue() ) ;
//			
//			Agent ag = (Agent) e.getValue() ;
//			System.out.println ( " age: " + ag.getAge() ) ;
//		}
//		

	}

}














