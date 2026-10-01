package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Return a List<Integer> containing the unique response times
 * greater than 400, sorted from highest to lowest.
 */
public class UniqueResponseTimesDescending 
{

	public static void main(String[] args) 
	{
		List<Integer> responseTimes =
			    Arrays.asList(120, 450, 780, 340, 450, 900, 120, 650);
		
	  List<Integer> sortedRes = responseTimes.stream().distinct().filter(res->res>400).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	  System.out.println(sortedRes);

	}

}
