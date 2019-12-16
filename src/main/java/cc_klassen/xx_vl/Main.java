package cc_klassen.xx_vl;

import java.util.ArrayList;
import java.util.List;

class Main{

	public static void main( String[] args ){

		List<Agent> agents = new ArrayList<>() ;

		for ( int ii=0 ; ii<5; ii++ ) {
			final Agent dog = new Dog( ii );
			agents.add( dog ) ;
		}
		for ( int ii=0 ; ii<5; ii++ ){
			agents.add( new Adult() ) ;
		}
		for( Agent agent : agents ){
			agent.move();

			if ( agent instanceof CanBark ){
				CanBark dog = (CanBark) agent;
				dog.bark();
			}
			if ( agent instanceof CanSpeak ) {
				((CanSpeak) agent).speak();
			}

		}

	}

}
