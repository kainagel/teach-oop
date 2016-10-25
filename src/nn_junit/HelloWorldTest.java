package nn_junit;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private static final String hello = "and I say hello ...";
	private static final String goodbye = "You say goodbye ...";
	
	@Before
	public void setUp(){
	}
	
	
	@Test
	public void testHelloWorld() {
		Assert.assertEquals("Hello World", HelloWorld.getHello());
	}
	
	@Test
	public void testGoodbye() {
		Assert.assertEquals("You don't say goodbye?", goodbye, HelloWorld.sayHelloGoodbye());
	}

	@Test
	public void testGoodbyeHello(){
		Assert.assertEquals("You don't say goodbye?", goodbye, HelloWorld.sayHelloGoodbye());

//		for (int i = 0; i <= 10; i++){
//			System.out.println("i=" + i );
//			if (i % 2 == 0){
//				Assert.assertEquals(hello, HelloWorld.sayHelloGoodbye());
//			}
//			else {
//				Assert.assertEquals(goodbye, HelloWorld.sayHelloGoodbye());
//			}
//		}
	}
	
}
