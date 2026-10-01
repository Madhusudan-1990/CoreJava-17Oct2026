package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort 
{

	public static void main(String[] args) 
	{
		List<Integer> list1 = Arrays.asList(2,5,1,7,3,8);
		
		//AscendingOrder
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//DescendingOrder / Reverse Order
		List<Integer> reverseSortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList);
		
		
		//Strings Ascending
		List<String> list2 = Arrays.asList("John","Mary","Kim","David","Smith");
		list2.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		//Strings Descending
		List<String> list3 = Arrays.asList("John","Mary","Kim","David","Smith");
		list3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		

	}

}
