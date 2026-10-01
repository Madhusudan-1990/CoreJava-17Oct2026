package Streams;

import java.util.HashSet;
import java.util.Set;

public class AnyMatchAllMatchNoneMatch {

	
	// Any Match, All Match, Non Match takes predicate as param
	public static void main(String[] args) 
	{
		Set<String> fruits = new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apples");
		fruits.add("More Grapes");
		fruits.add("Two Guavas");
		
		
		//Any Match
		boolean result = fruits.stream().anyMatch(value-> {return value.startsWith("One");}); //true
		System.out.println(result);
		
		//All Match
		result = fruits.stream().allMatch(value1-> {return value1.startsWith("One");}); //false
		System.out.println(result);
		
		//Non Match
		result = fruits.stream().noneMatch(value2-> {return value2.startsWith("One");});
		System.out.println(result);
		
		
		

	}

}
