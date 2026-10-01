package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(23,12,34,2,34,42,32);
		
		int secondLargestNumber = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		System.out.println(secondLargestNumber);
		
		
		
		
		

	}

}
