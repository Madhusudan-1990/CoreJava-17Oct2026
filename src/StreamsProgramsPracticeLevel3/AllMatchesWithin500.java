package StreamsProgramsPracticeLevel3;

import java.util.Arrays;
import java.util.List;

public class AllMatchesWithin500 {

	public static void main(String[] args) 
	{
		List<Integer> responseTimes =
			    Arrays.asList(120, 150, 90, 200, 180);
		
		boolean response = responseTimes.stream().allMatch(res->res<500);
		System.out.println(response);

	}

}
