package StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionList {

	public static void main(String[] args) 
	{
		List<Integer> scores = Arrays.asList(45, 72, 38, 91, 55, 60);
		
		Map<Boolean, List<Integer>> part = scores.stream().collect(Collectors.partitioningBy(n->n>=60));
		
		System.out.println(part);
		

	}

}
