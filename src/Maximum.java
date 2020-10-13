
public class Maximum implements Comparable {

	 public <K extends Comparable<K>> K getMax(K x,K y,K z)
	    {
	    	K max=x;
	    	if(y.compareTo(max)>0)
	    		max=y;
	    	if(z.compareTo(max)>0)
	    		max=z;
	    	return max;
	    }
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

}


	