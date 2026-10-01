package Filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) 
	{
		
//		ArrayList<Integer> numbersList = new ArrayList<Integer>();
//		numbersList.add(10);
//		numbersList.add(15);
//		numbersList.add(20);
//		numbersList.add(25);
//		numbersList.add(30);
//		
		//Instead of above we can use below
		
		List<Integer> numbersList = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumbersList = new ArrayList<Integer>();
//		
//		//without using streams
//		for(int num : numbersList)
//		{
//			if(num%2==0)
//			{
//				evenNumbersList.add(num);
//			}
//		}
//		System.out.println(evenNumbersList);
		
		//with streams using filter
		
//		evenNumbersList = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(evenNumbersList);
		
		// or 
//		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n)); // foreach takes consumer, filter will take predicate 
		
		//or
		
		numbersList.stream().filter(n->n%2==0).forEach(System.out::println); // another way of replacing lambda expression
		
	}

}
