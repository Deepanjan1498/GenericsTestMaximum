import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
           Integer x=10;
           Integer y=50;
           Integer z=100;
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
}
	
	
	
