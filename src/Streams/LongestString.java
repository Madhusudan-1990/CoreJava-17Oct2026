package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) 
	{
		List<String> words =  Arrays.asList("Java", "Selenium", "API", "Automation");
		
		words.stream().max(Comparator.comparingInt(String::length)).orElse("");

	}

}
