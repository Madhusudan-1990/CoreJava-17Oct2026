package StreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindShortestString {

	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList(
	            "stream", "lambda", "functional", "java", "collections"
	        );

		
		String shortestString = words.stream().min(Comparator.comparingInt(String::length)).orElse("List is empty");
		System.out.println(shortestString);
		
		 // All words sorted by length
		
		words.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
	}

}
