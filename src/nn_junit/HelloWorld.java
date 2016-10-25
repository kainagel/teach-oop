package nn_junit;

public class HelloWorld {

	private static boolean sayHello = false;
	
	static String getHello() {
		return "Hello World" ;
	}
	
	static String sayHelloGoodbye(){
		if (sayHello){
			sayHello = false;
			return "and I say hello ...";
		}
		else {
			sayHello = true;
			return "You say goodbye ...";
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getHello());
		System.out.println(sayHelloGoodbye());
		System.out.println(sayHelloGoodbye());
	}

}
