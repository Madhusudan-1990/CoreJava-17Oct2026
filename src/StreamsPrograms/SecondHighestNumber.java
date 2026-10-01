package StreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestNumber {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 20, 15);
		
		Optional<Integer> secondHigh =  numbers.stream().distinct()
						          .sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		System.out.println(secondHigh.get());
		

		
	}

}
