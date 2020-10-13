import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
          
		static Integer integer1=10;
          static Integer integer2=50;
          static Integer integer3=100;
          static Float float1 =10.3f;
          static Float float2= 50.00f;
          static Float float3= 100.3f;
          static String string1= "Apple";
          static String string2="Peach";
           static String string3="banana";
	@Test
	public void whenMaximumGivenAtFirstShouldReturnFirst(){
		Maximum<Integer> max = new Maximum<Integer>(integer1,integer2,integer3);
		Integer maximum = max.getMax(integer3,integer1,integer2);
		Assert.assertEquals(integer3, maximum);
	}
	@Test
	public void whenMaximumGivenAtSecondShouldReturnSecond(){
		Maximum<Integer> max = new Maximum<Integer>(integer1,integer2,integer3);
		Integer maximum = max.getMax(integer1,integer3,integer2);
		Assert.assertEquals(integer3, maximum);
	}
	@Test
	public void whenMaximumGivenAtThirdShouldReturnThird(){
		Maximum<Integer> max = new Maximum<Integer>(integer1,integer2,integer3);
		Integer maximum = max.getMax(integer1,integer2,integer3);
		Assert.assertEquals(integer3, maximum);
	}
	@Test
	public void whenMaximumAtFirstShouldReturnFirst(){
		Maximum<Float> max = new Maximum<Float>(float1,float2,float3);
		Float maximum = max.getMax(float3,float1,float2);
		Assert.assertEquals(float3, maximum);
	}
	@Test
	public void whenMaximumAtSecondShouldReturnSecond(){
		Maximum<Float> max = new Maximum<Float>(float1,float2,float3);
		Float maximum = max.getMax(float1,float3,float2);
		Assert.assertEquals(float3, maximum);
}
	@Test
	public void whenMaximumAtThirdShouldReturnThird(){
		Maximum<Float> max = new Maximum<Float>(float1,float2,float3);
		Float maximum = max.getMax(float1,float2,float3);
		Assert.assertEquals(float3, maximum);
	}
	@Test
	public void whenMaximumStringAtFirstShouldReturnFirst(){
		Maximum<String> max = new Maximum<String>(string1,string2,string3);
		String maximum = max.getMax(string3,string1,string2);
		Assert.assertEquals(string3, maximum);
	}
	@Test
	public void whenMaximumStringAtSecondShouldReturnSecond(){
		Maximum<String> max = new Maximum<String>(string1,string2,string3);
		String maximum = max.getMax(string1,string3,string2);
		Assert.assertEquals(string3, maximum);
}
	@Test
	public void whenMaximumStringAtThirdShouldReturnThird(){
		Maximum<String> max = new Maximum<String>(string1,string2,string3);
		String maximum = max.getMax(string1,string2,string3);
		Assert.assertEquals(string3, maximum);
	}

}


	
	
