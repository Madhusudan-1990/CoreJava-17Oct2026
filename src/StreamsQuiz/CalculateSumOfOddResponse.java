package StreamsQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Calculate the sum of squares of all odd execution times.
 */
public class CalculateSumOfOddResponse {

	public static void main(String[] args) 
	{
		List<Integer> executionTimes =
			    Arrays.asList(120, 451, 200, 751, 330, 901, 450, 181);
		
		Integer sum = executionTimes.stream().filter(n->n%2!=0).map(n->n*n).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
	}

}
