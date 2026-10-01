package StreamsQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Partition the response times into two groups:
true → response time is greater than 500
false → response time is 500 or less
 */
public class PartitionBasedOnResponseTime {

	public static void main(String[] args) 
	{
		List<Integer> responseTimes =
			    Arrays.asList(120, 650, 300, 800, 450, 200, 900);
		
	  Map<Boolean, List<Integer>> responsePartition = responseTimes.stream().collect(Collectors.partitioningBy(res->res>500));
	  System.out.println(responsePartition);

	}

}
