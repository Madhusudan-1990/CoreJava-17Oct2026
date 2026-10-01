package StreamsQuiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find the frequency of each test name, but return the result sorted by frequency from highest to lowest.
 */
public class FrequencyWithHighestToLowest {

	public static void main(String[] args) 
	{
		List<String> testNames =
			    Arrays.asList(
			        "LoginTest",
			        "PaymentTest",
			        "LoginTest",
			        "SearchTest",
			        "PaymentTest",
			        "LoginTest",
			        "LogoutTest"
			    );
		
		
	 Map<String, Long> frequency = testNames.stream()
			 .sorted(Comparator.reverseOrder())
			 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	 				   
	 
	 System.out.println(frequency);

	}

}
