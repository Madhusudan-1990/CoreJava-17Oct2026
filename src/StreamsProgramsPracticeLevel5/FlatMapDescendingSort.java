package StreamsProgramsPracticeLevel5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Flatten all response times, keep only response times greater than 400, 
 * sort them in descending order, and return a List<Integer>.
 */

public class FlatMapDescendingSort 
{

	public static void main(String[] args) 
	{
		List<List<Integer>> responseTimes =
			    Arrays.asList(
			        Arrays.asList(120, 650, 300),
			        Arrays.asList(800, 450, 200),
			        Arrays.asList(700, 150)
			    );
		
	    List<Integer> listedRes = responseTimes.stream().flatMap(res->res.stream()).filter(res->res>400)
							  .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(listedRes);

	}

}
