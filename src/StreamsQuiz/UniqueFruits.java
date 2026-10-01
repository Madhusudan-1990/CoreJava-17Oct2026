package StreamsQuiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Get unique fruits, sorted A-Z, as a List.
public class UniqueFruits {

	public static void main(String[] args) 
	{
		List<String> fruits = Arrays.asList("Mango", "Apple", "Mango",
			                  "Banana", "Apple", "Cherry");
		
		List<String> distinctFruits = fruits.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(distinctFruits);
	}

}
