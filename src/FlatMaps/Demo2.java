package FlatMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 
{

	public static void main(String[] args) 
	{
		List<String> teamA = Arrays.asList("Scott","David","John");
		List<String> teamB = Arrays.asList("Mary","Luna","Tom");
		List<String> teamC = Arrays.asList("Ken","Jony","Kitty");
		
		List<List<String>> playersInworldCup = Arrays.asList(teamA,teamB,teamC);
		
		playersInworldCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
