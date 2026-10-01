package StreamsQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfEachStatus {

	/*
	 * Requirement: Create a Map<String, Long> containing the frequency of each status.
	 */
	public static void main(String[] args) 
	{
		List<String> testStatuses =
			    Arrays.asList(
			        "PASS", "FAIL", "PASS", "SKIPPED",
			        "FAIL", "PASS", "FAIL"
			    );
		
	  Map<String, Long> frequency = testStatuses.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  System.out.println(frequency);

	}

}
