package StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElement {

	public static void main(String[] args) 
	{
		List<String> items = Arrays.asList("a", "b", "a", "c", "a", "b");
		
		String mostFrequent = items.stream()
							  .collect(Collectors.groupingBy(s->s,Collectors.counting()))
							  .entrySet().stream()
							  .max(Map.Entry.comparingByValue())
							  .get()
							  .getKey();
		
		System.out.println(mostFrequent);
		

	}

}
