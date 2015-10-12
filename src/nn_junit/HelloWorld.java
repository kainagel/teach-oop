package nn_junit;

public class HelloWorld {

	private boolean sayHello = false;
	
	public String getHello(){
		return "Hello World";
	}
	
	public String sayHelloGoodbye(){
		if (sayHello){
			this.sayHello = false;
			return "and I say hello...";
		}
		else {
			this.sayHello = true;
			return "You say goodbye...";
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new HelloWorld().getHello());
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.sayHelloGoodbye());
		System.out.println(hw.sayHelloGoodbye());
	}

}
