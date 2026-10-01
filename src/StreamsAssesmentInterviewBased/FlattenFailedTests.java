package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Return a:
List<String>
containing only the failed test names, without the "-FAIL" suffix.
 */
public class FlattenFailedTests 
{

	public static void main(String[] args) 
	{
		List<List<String>> testResults =
			    Arrays.asList(
			        Arrays.asList("Login-PASS", "Payment-FAIL"),
			        Arrays.asList("Search-PASS", "Checkout-FAIL"),
			        Arrays.asList("Logout-PASS")
			    );
		
	 List<String> list = testResults.stream().flatMap(test->test.stream()).filter(test->test.contains("-FAIL"))
							.map(test->test.replace("-FAIL",""))
							.collect(Collectors.toList());
	 
	 System.out.println(list);

	}

}
