package StreamsProgramsPracticeLevel5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMapWithGrouping {

	public static void main(String[] args) 
	{
		List<List<String>> testResults =
			    Arrays.asList(
			        Arrays.asList("PASS", "FAIL", "PASS"),
			        Arrays.asList("FAIL", "PASS"),
			        Arrays.asList("PASS", "FAIL")
			    );
		
		Map<String, Long> finalResult = testResults.stream()
				.flatMap(status->status.stream())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(finalResult);

	}

}
