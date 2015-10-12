package gg_polymorphism.bb_PolymorphWInterface;
import java.util.*;

class Test {

	public static void main( String[] args ) {
		List<AgentI> agents = new ArrayList<>() ;

		for ( int ii=0 ; ii<5 ; ii++ ) {
			Person pe = new Person(ii) ;
			agents.add( pe ) ;
		}
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Dog dg = new Dog(ii) ;
			agents.add( dg ) ;
		}
		
		AgentI ag2 = agents.get(5);


		for ( AgentI ag : agents ) {
			System.out.println( "Agent with id: " + ag.getId() ) ;
			ag.move() ;
			
			if ( ag instanceof Runnable ) {
				((Runnable) ag).run();
			}
		}

	}

}
