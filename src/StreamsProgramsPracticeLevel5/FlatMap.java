package StreamsProgramsPracticeLevel5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) 
	{
		List<List<String>> testTags =
			    Arrays.asList(
			        Arrays.asList("smoke", "regression"),
			        Arrays.asList("api", "smoke"),
			        Arrays.asList("sanity")
			    );
		
	List<String> finalList = testTags.stream().flatMap(x->x.stream()).distinct().collect(Collectors.toList());
	System.out.println(finalList);
	
	//or
	List<String> finalList1 = testTags.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
	System.out.println(finalList1);

	}

}
