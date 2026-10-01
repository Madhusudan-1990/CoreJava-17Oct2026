package Filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	// Name of person greater than 6 and less than 8
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Ramakrishna","Ravi","Sansa","Daeunersys","Jimmyyy");
		
		List<String> filteredNames = new ArrayList<String>();
		
//		filteredNames = names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
//		System.out.println(filteredNames);
		
//		names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
		
		//Or
		names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
		

	}

}
