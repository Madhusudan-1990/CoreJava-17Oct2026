package StreamsProgramsPracticeLevel4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {

	public static void main(String[] args) 
	{
		List<Integer> responseTimes = Arrays.asList(120, 600, 250, 800, 300);
		Map<Boolean, List<Integer>> status = responseTimes.stream().collect(Collectors.partitioningBy(res->res>500));
		System.out.println(status);

	}

}
