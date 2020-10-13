
public class Maximum implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Integer getMaxOfIntegers(Integer a, Integer b, Integer c) {
		Integer maximum=a;
		if(b.compareTo(maximum)>0)
			maximum=b;
			if(c.compareTo(maximum)>0)
				maximum=c;
		return maximum;
			
         }

	public Float getMaxOfFloats(Float x, Float y, Float z) {
		Float maximum=x;
		if(y.compareTo(maximum)>0)
			maximum=y;
			if(z.compareTo(maximum)>0)
				maximum=z;
		return maximum;
			
	}
}

	