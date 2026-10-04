package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find the frequency of every word.
 */
public class StreamsWordFrequency {

	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList(
			    "java",
			    "selenium",
			    "java",
			    "api",
			    "selenium",
			    "java"
			);
		
	Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(wordCount);

	}

}
