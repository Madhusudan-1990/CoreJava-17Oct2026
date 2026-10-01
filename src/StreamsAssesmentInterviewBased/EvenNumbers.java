package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Return a List<Integer> containing only the even numbers.
 */
public class EvenNumbers {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(23, 32, 2, 5009, 93, 50, 31, 86);
		List<Integer> nums = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(nums);

	}

}
