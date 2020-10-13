
public class Maximum<K extends Comparable<K>> {
	
	    K x,y,z;
	    
	   
	 public Maximum(K x, K y, K z) {
			super();
			this.x = x;
			this.y = y;
			this.z = z;
		}
	 public K getMaximum()
	 {
		 return Maximum.getMax(x,y,z);
	 }
	public static <K extends Comparable<K>> K getMax(K x,K y,K z)
	    {
	    	K max=x;
	    	if(y.compareTo(max)>0)
	    		max=y;
	    	if(z.compareTo(max)>0)
	    		max=z;
	    	return max;
	    }
		
}


	