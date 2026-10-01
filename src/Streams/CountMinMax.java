package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountMinMax {

	public static void main(String[] args) 
	{
		
		List<Integer>numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//count
		long noOfEvenNums = numbersList.stream().filter(n->n%2==0).count();
		System.out.println(noOfEvenNums);
		
		//min(takes 2 arguments val1 and val2 --> returns val1 compare to val2. This is of Optional type
		
		Optional<Integer>min = numbersList.stream().min((val1,val2)->{
												return val1.compareTo(val2);});
		
		System.out.println(min.get());
		
		//max (takes 2 arguments val1 and val2 --> returns val1 compare to val2
		
		Optional<Integer>max = numbersList.stream().max((val1,val2)->
		{
			return val1.compareTo(val2);
		});
		System.out.println(max.get());
		
	}

}
