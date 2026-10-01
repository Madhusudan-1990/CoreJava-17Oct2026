package StreamsQuiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
 * Find the second-highest unique response time.
 */
public class SecondHighestResponse 
{

	public static void main(String[] args) 
	{
		List<Integer> responseTimes =  Arrays.asList(450, 120, 780, 340, 780, 220, 910, 450);
		
		responseTimes.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		
		//or 
		
	Integer secondHighest = responseTimes.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
	
		System.out.println(secondHighest);
		

	}

}
