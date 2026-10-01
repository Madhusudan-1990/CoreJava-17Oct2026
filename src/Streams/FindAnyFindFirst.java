package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFindFirst {

	public static void main(String[] args) 
	{
		List<String> stringList = Arrays.asList("one","two","three","one");
		
		//findAny()
		 Optional<String> ele = stringList.stream().findAny();
		 System.out.println(ele.get()); // one
		 
		 //findFirst()
		 List<String> stringList1 = Arrays.asList("one","two","three","one");
		 Optional<String> ele1 = stringList1.stream().findFirst();
		 System.out.println(ele1.get());
		 

	}

}
