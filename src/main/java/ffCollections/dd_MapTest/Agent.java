package ffCollections.dd_MapTest;
class Agent {
	private int age ;
	public int getAge() { 
		return this.age ; 
	}
	
	public Agent ( int age ) {
		this.age = age ;
	}
	public void doSomething(){
		System.out.println("agent with age=" + age + " is doing something.");
	}

//	@Override
//	public String toString() {
//		return "[age: " + this.age + "]" ;
//	}
}
