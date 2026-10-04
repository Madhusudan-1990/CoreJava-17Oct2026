package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDuplicateCharacters {

	public static void main(String[] args) 
	{
		
		String input = "programming";
		
		Map<Character, Long> occurance = 
							input.chars()
								.mapToObj(c->(char) c)
									.collect(Collectors.groupingBy(
												Function.identity(),Collectors.counting()));
		
		
		List<Character> duplicates = 
						occurance.entrySet()
									.stream()
										.filter(entry->entry.getValue()>1)
										  .map(entry->entry.getKey())
										  	 .collect(Collectors.toList());
		
		System.out.println(duplicates);

	}

}
