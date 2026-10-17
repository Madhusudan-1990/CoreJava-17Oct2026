package StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElementsByProperty {

	public static void main(String[] args) 
	{
		List<String> fruits = Arrays.asList("apple", "ant", "banana", "avocado", "blueberry");
		
		Map<Character, List<String>> group = fruits.stream().collect(Collectors.groupingBy(s->s.charAt(2)));
		
		System.out.println(group);

	}

}
