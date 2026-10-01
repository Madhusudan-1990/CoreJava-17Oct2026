package MapsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) 
	{
		List<Integer> numbersList = Arrays.asList(2,3,4,5);
		
		numbersList.stream().map(num->num*3).collect(Collectors.toList()).forEach(System.out::println);
		
		//or 
		numbersList.stream().map(num->num*3).collect(Collectors.toList()).forEach(num->System.out.println(num));
		
		//or
		
		List<Integer> calculatedNumbers = numbersList.stream().map(num->num*3).collect(Collectors.toList());
		
		System.out.println(calculatedNumbers);

	}

}
