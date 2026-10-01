package StreamsQuiz;

import java.util.Arrays;
import java.util.List;

//Skip the first 3, take the next 3, and print each.
public class Skip3Limit3 {

	public static void main(String[] args) 
	{
		List<Integer> numbers =
			    Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800);
		
		numbers.stream().skip(3).limit(3).forEach(System.out::println);

	}

}
