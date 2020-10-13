import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
           Integer x=10;
           Integer y=50;
           Integer z=100;
           Float a =10.3f;
           Float b = 50.00f;
           Float c = 100.3f;
	@Test
	public void whenMaximumGivenAtFirstShouldReturnFirst(){
		Maximum max = new Maximum();
		Integer maximum = max.getMaxOfIntegers(z,x,y);
		Assert.assertEquals(z, maximum);
	}
	@Test
	public void whenMaximumGivenAtSecondShouldReturnSecond(){
		Maximum max = new Maximum();
		Integer maximum = max.getMaxOfIntegers(x,z,y);
		Assert.assertEquals(z, maximum);
	}
	@Test
	public void whenMaximumGivenAtThirdShouldReturnThird(){
		Maximum max = new Maximum();
		Integer maximum = max.getMaxOfIntegers(x,y,z);
		Assert.assertEquals(z, maximum);
	}
	@Test
	public void whenMaximumAtFirstShouldReturnFirst(){
		Maximum max = new Maximum();
		Float maximum = max.getMaxOfFloats(c,a,b);
		Assert.assertEquals(c, maximum);
	}
	@Test
	public void whenMaximumAtSecondShouldReturnSecond(){
		Maximum max = new Maximum();
		Float maximum = max.getMaxOfFloats(a,c,b);
		Assert.assertEquals(c, maximum);
}
	@Test
	public void whenMaximumAtThirdShouldReturnThird(){
		Maximum max = new Maximum();
		Float maximum = max.getMaxOfFloats(a,b,c);
		Assert.assertEquals(c, maximum);
	}
}

	
	
