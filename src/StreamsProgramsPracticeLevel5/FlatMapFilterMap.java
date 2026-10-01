package StreamsProgramsPracticeLevel5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Requirement:
Flatten all test case names.
Keep only names containing "api".
Convert them to uppercase.
Collect them into a List<String>.
 * */
public class FlatMapFilterMap {

	public static void main(String[] args) 
	{
		List<List<String>> testCases =
			    Arrays.asList(
			        Arrays.asList("login", "smoke", "api"),
			        Arrays.asList("payment", "regression", "api"),
			        Arrays.asList("logout", "smoke")
			    );
		
	 List<String> list = testCases.stream().flatMap(m->m.stream())
			 				.filter(n->n.contains("api"))
			 				.map(n->n.toUpperCase())
			 				.collect(Collectors.toList());
	 
	 System.out.println(list);
	}

}
