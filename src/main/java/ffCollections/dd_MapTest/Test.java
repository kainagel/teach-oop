package ffCollections.dd_MapTest;

import java.util.*;
import java.util.Map.Entry;

class Test {
	public static void main(String[] args) {

		Agent ag0 = new Agent(10) ;
		Agent ag1 = new Agent(20) ;
		Agent ag2 = new Agent(30) ;
		Agent ag3 = new Agent(40) ;

//		List<Agent> agentList = new ArrayList<>();
//		agentList.add( ag0);
//		agentList.add( ag1);
//		agentList.add( ag2);


		Map<String,Agent> agents = new LinkedHashMap<>() ;

		agents.put( "Meier", ag0 ) ;
		agents.put( "Mueller", ag1 ) ;
		agents.put( "Schmidtz", ag2 ) ;
		agents.put( "Meier", ag3 ) ;

		for( Agent agent : agents.values() ){
			agent.doSomething();
		}

		System.exit( -1 );


//		for( Agent agent : agentList ){
//			agent.doSomething() ;
//		}
//
//		for( Agent agent : agents.values() ){
//			agent.doSomething();
//		}

//		for( String string : agents.keySet() ){
//			agents.get( string ).doSomething();
//		}

//		for( Entry<String, Agent> entry : agents.entrySet() ){
//			Agent value = entry.getValue();
//			String key = entry.getKey();
//		}

		for( Entry<String, Agent> entry : agents.entrySet() ){
			Agent agent = entry.getValue();
			String key = entry.getKey();
		}




		
//		for ( String key : agents.keySet() ) {
//			System.out.println( "key=" + key + "; age=" + agents.get(key).getAge() ) ;
//		}
//		for ( Entry<String,Agent> entry : agents.entrySet() ) {
//			System.out.println( "key=" + entry.getKey() + "; age=" + entry.getValue().getAge() ) ;
//		}
		
		
//		Agent ag = agents.get("blablub") ;
//		if ( ag==null ) {
//			throw new RuntimeException("could not get agent") ;
//		}
//		System.out.println( ag.getAge() ) ;
		
		
//		for ( Agent ag : agents.values() ) {
//			System.out.println( ag.getAge() ) ;
//		}
		
//		for ( String str : agents.keySet() ) {
//			System.out.println( str ) ;
//		}
		
//		for ( Entry<String, Agent> ee : agents.entrySet() ) {
//			System.out.println( "getKey: " + ee.getKey() );
//			System.out.println( "getValue: " + ee.getValue().getAge() );
//			System.out.println(""); 
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














