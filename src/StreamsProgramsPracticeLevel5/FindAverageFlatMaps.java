package StreamsProgramsPracticeLevel5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverageFlatMaps {

	public static void main(String[] args) 
	{
		List<List<Integer>> executionTimes =
			    Arrays.asList(
			        Arrays.asList(120, 250, 300),
			        Arrays.asList(450, 180),
			        Arrays.asList(600, 220)
			    );
		
	       Double avg = executionTimes.stream().flatMap(List::stream).collect(Collectors.averagingInt(x->x));
	       System.out.println(avg);
	       
	       //or
	       
	      double avg2 = executionTimes.stream().flatMap(x->x.stream()).mapToInt(Integer::intValue).average().orElse(0);
	      System.out.println(avg2);
	      
	       double avg3 = executionTimes.stream().flatMap(List::stream).mapToInt(Integer::intValue).average().orElse(0);
	       System.out.println(avg3);

	}

}
