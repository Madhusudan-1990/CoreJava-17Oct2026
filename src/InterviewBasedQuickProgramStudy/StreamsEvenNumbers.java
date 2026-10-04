package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEvenNumbers {

	public static void main(String[] args) 
	{
		List<Integer> evenNumbers = Arrays.asList(23,32,2,5009,93,50,31,86);
		
		evenNumbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		
		//or
		
    List<Integer> evenNumbers1 = Arrays.asList(23,32,2,5009,93,50,31,86);
		
    List numbers = evenNumbers1.stream().filter(n->n%2==0).collect(Collectors.toList());
   
   
	}

}
