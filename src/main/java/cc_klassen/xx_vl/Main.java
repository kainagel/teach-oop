package cc_klassen.xx_vl;

import java.util.ArrayList;
import java.util.List;

class Main{

	public static void main( String[] args ){

		// container
		List<Agent> agents = new ArrayList<>() ;

		// objects of different implementations are created:
		for ( int ii=0 ; ii<5; ii++ ) {
			final Agent dog = new Dog( ii );
			agents.add( dog ) ;
		}
		for ( int ii=0 ; ii<5; ii++ ){
			agents.add( new Person() ) ;
		}


		// the objects are used:
		for( Agent agent : agents ){
			agent.move();

			if ( agent instanceof CanBark ) {
				((CanBark) agent).bark();
			}

			if ( agent instanceof CanSpeak ) {
				((CanSpeak) agent).speak();
			}


		}

	}

}
