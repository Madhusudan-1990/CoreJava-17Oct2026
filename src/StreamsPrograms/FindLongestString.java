package StreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList(
	            "stream", "lambda", "functional", "java", "collections"
	        );
		
		String str = words.stream().max(Comparator.comparingInt(String::length)).orElse("List is empty");
		System.out.println(str);
		

	}

}
