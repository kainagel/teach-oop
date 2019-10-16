package ffCollections.bb_ListWithPolymorphismAndCast;

import java.util.*;


class Main {
	public static void main(String[] args) {

		List<AgentI> agents = new LinkedList<>() ;

		for ( int ii=1 ; ii<=5; ii++ ) {
			Person ag = new Person(ii) ;
			agents.add ( ag ) ;
		}
		for ( int ii=1 ; ii<=5; ii++ ) {
			Dog ag = new Dog(ii) ;
			agents.add ( ag ) ;
		}

		for ( AgentI ag : agents ) {
			if ( ag instanceof Dog ) {
				Dog dog = (Dog) ag ;
				dog.howl();
			}
		}

	}
}














