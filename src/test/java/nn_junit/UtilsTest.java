package nn_junit;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest{

	@Test
	public void getHello(){
		Assert.assertEquals(  "Hello World", Utils.getHello() ) ;
	}
	@Test
	public void sayHelloGoodbye(){
	}
}
