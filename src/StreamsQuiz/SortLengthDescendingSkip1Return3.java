package StreamsQuiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort by length descending, skip the first 1, and return the next 3 as a List.
public class SortLengthDescendingSkip1Return3 {

	public static void main(String[] args) 
	{
		List<String> tools =
			    Arrays.asList("Selenium", "Java", "Python",
			                  "API", "RestAssured", "AWS");	
		
		List<String> strList = tools.stream().sorted(Comparator.comparing(String::length).reversed()).skip(1).limit(3).collect(Collectors.toList());
		System.out.println(strList);

	}

}
