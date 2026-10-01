package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Return the test-case names that:

Start with "A"
Convert them to uppercase
Sort them alphabetically
 */
public class StringTransformation {

	public static void main(String[] args) 
	{
		
		List<String> testCases = Arrays.asList(
			    "LoginTest",
			    "PaymentTest",
			    "ApiTest",
			    "LogoutTest",
			    "SearchTest",
			    "AdminTest"
			);
		
		List<String> list = testCases.stream().filter(n->n.startsWith("A")).map(n->n.toUpperCase()).sorted().collect(Collectors.toList());

		System.out.println(list);
	}

}
