package Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(3,8,10,3,6,9,16);
		
		int sum = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);

	}

}
