package cc_klassen.yyCallbackPattern.framework;

import java.util.ArrayList;
import java.util.List;

public class Framework{
	private List<cc_klassen.yyCallbackPattern.framework.Agent> agents = new ArrayList<>() ;

	public void add( cc_klassen.yyCallbackPattern.framework.Agent agent ) {
		this.agents.add( agent ) ;
	}

	public void run(){
		for( int timeStep = 0 ; timeStep < 10 ; timeStep++ ){
			System.out.println(  "=== starting new timeStep=" + timeStep );
			for( Agent agent : agents ){
				agent.move();
			}
		}
	}

}
