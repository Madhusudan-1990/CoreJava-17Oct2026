package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) 
	{
		List<String> words =
		        Arrays.asList(
		            "java", "selenium", "java",
		            "api", "selenium", "java"
		        );
		
		Map<String,Long> wordsByGroup = words.stream()
				.collect(Collectors.groupingBy(word->word,Collectors.counting()));
		
		System.out.println(wordsByGroup);
		

	}

}
