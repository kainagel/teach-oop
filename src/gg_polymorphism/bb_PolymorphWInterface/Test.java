package gg_polymorphism.bb_PolymorphWInterface;
import java.util.*;

class Test {

	public static void main( String[] args ) {

		ArrayList<AgentI> agents = new ArrayList<>() ;

		for ( int ii=0 ; ii<5 ; ii++ ) {
			PersonImpl pe = new PersonImpl(ii) ;
			agents.add( pe ) ;
		}
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Dog dg = new Dog(ii) ;
			agents.add( dg ) ;
		}
		
		for ( AgentI ag : agents ) {
			System.out.println( "Agent with id: " + ag.getId() ) ;
			ag.move() ;
			
			if ( ag instanceof CanBark ) {
				((CanBark) ag).bark();
			}
		}

	}

}
