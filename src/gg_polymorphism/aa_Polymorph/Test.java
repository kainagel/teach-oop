package gg_polymorphism.aa_Polymorph;
import java.util.*;

class Test {

	public static void main( String[] args ) 
	{
		List<AgentI> agents = new ArrayList<AgentI>() ;
		
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Person pe = new Person ( ) ;
			agents.add( pe ) ;
		}
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Agent ag = new Agent ( ) ;
			agents.add( ag ) ;
		}
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Dog dg = new Dog ( ) ;
			agents.add( dg ) ;
		}

		for ( AgentI ag : agents ) {
			ag.move(22)  ;
			// ag.move(1) ;
		}

	}

}
