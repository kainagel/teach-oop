package cc_klassen.yyCallbackPattern.usercode;

class MyAgent extends cc_klassen.yyCallbackPattern.framework.Agent{


	private final String name;

	MyAgent( String name ) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.println(  "calling MyAgent move method on agent with name=" + name  );
	}

}
