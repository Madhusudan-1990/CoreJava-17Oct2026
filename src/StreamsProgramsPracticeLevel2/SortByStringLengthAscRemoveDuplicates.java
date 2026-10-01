package StreamsProgramsPracticeLevel2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Given:  ["Java", "Go", "Python", "C", "Kotlin", "R"]
Task:   Sort by string LENGTH ascending,
        remove duplicates,
        print each
Expected: C, R, Go, Java, Python, Kotlin
 * */
public class SortByStringLengthAscRemoveDuplicates 
{
	public static void main(String args[])
	{
	List<String> pLanguageList = Arrays.asList("Java", "Go", "Python", "C", "Kotlin", "R");
	
		pLanguageList.stream().sorted(Comparator.comparing(String::length)).distinct().forEach(System.out::println);
	
	
	}
	
}
