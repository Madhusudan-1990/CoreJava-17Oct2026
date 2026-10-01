package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.List;
/*
 * Determine whether at least one test has failed.
 */
public class FailedTestCount {

	public static void main(String[] args) 
	{
		List<String> testStatuses =
			    Arrays.asList(
			        "PASS", "FAIL", "PASS", "FAIL",
			        "SKIPPED", "FAIL", "PASS"
			    );
		
	 boolean status =	testStatuses.stream().anyMatch(s->s.equals("FAIL"));
	 System.out.println(status);
	}

}
