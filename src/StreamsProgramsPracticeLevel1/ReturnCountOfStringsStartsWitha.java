package StreamsProgramsPracticeLevel1;

import java.util.Arrays;
import java.util.List;


//Given:  ["apple", "banana", "avocado", "cherry", "apricot"]
//Task:   Return COUNT of strings that start with letter 'a'
//Expected: 3
public class ReturnCountOfStringsStartsWitha {

	public static void main(String[] args) 
	{
		
		List<String> fruits = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
		
		long count = fruits.stream().filter(f->f.startsWith("a")).count();
		System.out.println(count);

	}

}
