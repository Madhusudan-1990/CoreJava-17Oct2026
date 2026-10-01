package MapsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) 
	{
	
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		
		List<Integer> strLenght = vehicles.stream().map(v->v.length()).collect(Collectors.toList());
		System.out.println(strLenght);
		
		vehicles.stream().map(v->v.length()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
