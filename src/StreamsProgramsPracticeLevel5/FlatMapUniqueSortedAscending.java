package StreamsProgramsPracticeLevel5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Flatten all results and 
 * return a List<String> containing only the unique "FAIL" and "SKIPPED" statuses,
 *  sorted alphabetically.
 */
public class FlatMapUniqueSortedAscending {

	public static void main(String[] args) 
	{
		
		List<List<String>> apiResults =
			    Arrays.asList(
			        Arrays.asList("PASS", "FAIL", "PASS"),
			        Arrays.asList("FAIL", "SKIPPED"),
			        Arrays.asList("PASS", "FAIL")
			    );
		
	  List<String> apiFiltered = apiResults.stream().flatMap(api->api.stream())
		.distinct().filter(api->api.equals("FAIL") || api.equals("SKIPPED")).sorted()
		.collect(Collectors.toList());
	  
	  System.out.println(apiFiltered);

	}

}
