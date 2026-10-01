package StreamsProgramsPracticeLevel2;

import java.util.Arrays;
import java.util.List;

/*
 * Given:  [10, 5, 10, 30, 20, 5, 25, 30]
Task:   Remove duplicates,
        sort ascending,
        return only first 4 elements as a List
Expected: [5, 10, 20, 25]
 * */

public class RemoveDupSortAscReturnFirst4Elements {

	public static void main(String[] args) 
	{
		List<Integer> numList = Arrays.asList(10, 5, 10, 30, 20, 5, 25, 30);
		
		numList.stream().distinct().sorted().limit(4).forEach(System.out::println);

	}

}
