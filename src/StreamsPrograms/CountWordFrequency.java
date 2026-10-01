package StreamsPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordFrequency {

	public static void main(String[] args) 
	{
		
		String sentence = "the cat sat on the mat the cat";
		
		Map<String, Long> freq = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(freq);
	}

}
