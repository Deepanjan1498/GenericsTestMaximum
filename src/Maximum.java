
public class Maximum<K extends Comparable<K>> {
	
	 K[] arrayInput;
	    
	 public Maximum(K[] arrayInput) {
		super();
		this.arrayInput = arrayInput;
	}
	public K getMaximum()
	 {
		 return Maximum.getMax(arrayInput);
	 }
	public static <K extends Comparable<K>> K getMax(K[] arrayInput)
	    {
	    	K maximum=arrayInput[0];
	    	for(K element:arrayInput)
	    	{
	    		if(element.compareTo(maximum)>0)
	    			maximum=element;
	    	}
	    	printMax(arrayInput,maximum);
	    	return maximum;
	    }
	public static <K> void printMax(K[] arrayInput,K maximum)
	{
		System.out.println("All elements present are:");
		for(K element:arrayInput)
			System.out.println(element);
		System.out.println("\nMaximum of all the elements provided is: "+maximum);
		
	}
	public static void main(String[] args)
	{
		Integer[] arrayInteger= {10,20,50,80,100,500};
         Float[] arrayFloat = {10.3f,20.0f,80.0f,100.0f};
         String[] arrayString= {"Apple","Peach","Banana","Watermelon"};
	       new Maximum(arrayInteger).getMaximum();
	       new Maximum(arrayFloat).getMaximum();
	       new Maximum(arrayString).getMaximum();
	}		
}


	