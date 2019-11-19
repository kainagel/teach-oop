package nn_junit;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest{

	@Test
	public void testMyMax() {
		beforeTest() ;
		double expected = 7. ;
		double actual = Utils.myMax( 3., 5., 7.  ) ;
		double epsilon = 0. ;
		Assert.assertEquals( expected, actual, epsilon );
	}
	@Test
	public void testMyMax2() {
		beforeTest() ;
		double expected = 5. ;
		double actual = Utils.myMax( 3., 5., -7.  ) ;
		double epsilon = 0. ;
		Assert.assertEquals( expected, actual, epsilon );
	}
	@Test
	public void testMyMax3() {
		beforeTest() ;
		double expected = -3. ;
		double actual = Utils.myMax( -3., -5., -7.  ) ;
		double epsilon = 0. ;
		Assert.assertEquals( expected, actual, epsilon );
	}
//	@Test
//	public void testMyMax4() {
//		beforeTest() ;
//		double expected = 0. ;
//		double actual = Utils.myMax( Double.MAX_VALUE, Double.MIN_VALUE, Double.POSITIVE_INFINITY  ) ;
//		double epsilon = 0. ;
//		Assert.assertEquals( expected, actual, epsilon );
//	}

	private void beforeTest() {

	}

}
