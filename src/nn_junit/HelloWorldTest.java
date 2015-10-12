package nn_junit;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld fixture;
	private static final String hello = "and I say hello...";
	private static final String goodbye = "You say goodbye...";
	
	@Before
	public void setUp(){
		this.fixture = new HelloWorld();
	}
	
	
	@Test
	public void testHelloWorld() {
		Assert.assertEquals("Hello World", this.fixture.getHello());
	}

	@Test
	public void testGoodbye() {
		Assert.assertEquals("You don't say goodbye?", goodbye, this.fixture.sayHelloGoodbye());
	}

	@Test
	public void testGoodbyeHello(){
		for (int i = 0; i <= 10; i++){
			if (i % 2 == 0){
				Assert.assertEquals(goodbye, this.fixture.sayHelloGoodbye());
			}
			else {
				Assert.assertEquals(hello, this.fixture.sayHelloGoodbye());
			}
		}
	}
	
}
