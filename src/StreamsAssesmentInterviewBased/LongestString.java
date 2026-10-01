package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find the longest string.
 */
public class LongestString {

	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList(
			    "Java",
			    "Selenium",
			    "Automation",
			    "API",
			    "Testing"
			);
		
	 String longestString = words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
	 System.out.println();
					

	}

}
