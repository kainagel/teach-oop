package hh_inheritanceFurtherDetails.bb_PolymorphWInterface;

import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

//		AgentI aa = new Adult(1);
//		AgentI dd = new Dog(2);
//
//		aa.move(); // Adult move method
//		dd.move(); // Dog move method
//
//		Adult adult = (Adult) dd;
//		adult.speak(); // compilation error "...speak() is undefined for the type AgentI"
		
//		Adult pp = (Adult) aa; // "cast"
//		pp.speak();
//		((Adult)aa).speak();
		
//		((Adult) dd).speak(); // run time error "...Dog cannot be cast to ...Adult"
		
		
		// Mit Collections:
		List<AgentI> agents = new ArrayList<>();

		for ( int i=0; i<5; i++){
			AgentI pe = new Adult(i);
			agents.add(pe);
		}
		for ( int i=0; i<5; i++){
			AgentI dg = new Dog(i);
			agents.add(dg);
		}

		for (AgentI ag : agents){ // Schleife über den Inhalt von agents
			ag.move(); // polymorphic!

			if ( ag instanceof CanBark ){
				((CanBark) ag).bark();
			}
			if ( ag instanceof DogI ){
				((DogI) ag).bark();
			}
		}
	}
	
}
