
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
	    	return maximum;
	    }
		
}


	