package Filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	
	//Remove nulls from collection
	public static void main(String[] args) 
	{
		
		List<String> words = Arrays.asList("cup",null,"saucer","plate",null,"book","desk");
		
		
		
		List<String> result = words.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.print(result);
		
		// or 
		
		 words.stream().filter(w->w!=null).collect(Collectors.toList()).forEach(w->System.out.println(w));
	}

}
