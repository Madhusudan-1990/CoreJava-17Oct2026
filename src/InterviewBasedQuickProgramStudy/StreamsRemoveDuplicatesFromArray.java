package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsRemoveDuplicatesFromArray {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 30);
		
		List<Integer> uniqueNum = list.stream()
										.distinct()
											.collect(Collectors.toList());
		
		System.out.println(uniqueNum);

	}

}
