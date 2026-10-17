package Test2Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestUsingStreams {

	public static void main(String[] args) 
	{
		List<Integer> list =  Arrays.asList(10, 25, 30, 25, 40, 30, 50);
		
		Integer secondHighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		System.out.println(secondHighest);

	}

}
