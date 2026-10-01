package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Find the second-highest UNIQUE number.
 */
public class SecondHighestUniqueNumber {

	
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10, 50, 20, 80, 30, 80, 70, 50);
		
	   Optional<Integer> uniqueNum = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	   System.out.println(uniqueNum.get());

	}

}
