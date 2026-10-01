package StreamsProgramsPracticeLevel3;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) 
	{
		List<Integer> executionTimes = Arrays.asList(120, 150, 90, 200);
		
		Integer i =  executionTimes.stream().reduce(0,(a,b) -> a+b);
		System.out.println(i);

	}

}
