package StreamsAssesmentInterviewBased;
/*
 * Return the number of failed tests as a long.
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FailedTestFrequency {

	public static void main(String[] args) 
	{
		List<String> results =
			    Arrays.asList(
			        "PASS", "FAIL", "FAIL",
			        "PASS", "SKIPPED", "FAIL",
			        "PASS", "FAIL"
			    );
		
		Long failedCount = results.stream().filter(status->status.equals("FAIL"))
						.collect(Collectors.counting());
		System.out.println(failedCount);

	}

}
