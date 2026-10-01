package StreamsProgramsPracticeLevel3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyResponseMoreThan500 {

	public static void main(String[] args) 
	{
		List<Integer> responseTimes = Arrays.asList(120, 150, 90, 850, 200);
		
		boolean result = responseTimes.stream().anyMatch(res->res>500);
		System.out.println(result);

	}

}
