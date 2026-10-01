package StreamsProgramsPracticeLevel1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Given:  [5, 3, 8, 1, 9, 2, 7, 4, 6]
Task:   Sort descending, skip first 2, take next 3
Expected: [7, 6, 5]*/
public class SortDescendSkip {

	public static void main(String[] args) 
	{
		
		List<Integer> numbersList = Arrays.asList(5, 3, 8, 1, 9, 2, 7, 4, 6);
		
		numbersList.stream().sorted(Comparator.reverseOrder()).skip(2).limit(3).forEach(System.out::println);

	}

}
