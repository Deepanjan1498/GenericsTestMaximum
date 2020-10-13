import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
          
		static Integer[] arrayInteger= {10,20,50,80,100,500};
         static Float[] arrayFloat = {10.3f,20.0f,80.0f,100.0f};
            static String[] arrayString= {"Apple","Peach","Banana","Watermelon"};
          
	@Test
	public void whenIntegerIsMaxShouldReturnIt(){
		Maximum<Integer> max = new Maximum<Integer>(arrayInteger);
		Integer maximum = max.getMaximum();
		Assert.assertEquals((Integer)500, maximum);
	}
	
	@Test
	public void whenFloatIsMaxShouldReturnFloat(){
		Maximum<Float> max = new Maximum<Float>(arrayFloat);
		Float maximum = max.getMaximum();
		Assert.assertEquals((Float)100.0f, maximum);
	}
	
	@Test
	public void whenStringIsMaxShouldReturnString(){
		Maximum<String> max = new Maximum<String>(arrayString);
		String maximum = max.getMaximum();
		Assert.assertEquals((String)"Watermelon", maximum);
	}
	
}


	
	
