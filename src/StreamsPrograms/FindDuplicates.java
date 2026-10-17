package StreamsPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
		
		Set<Integer> seen = new HashSet<Integer>();
		
		List<Integer> uniqueNumbers = numbers.stream()
										.filter(n->!seen.add(n))
										.collect(Collectors.toList());
		
		
		
		System.out.println(uniqueNumbers);

	}

}
