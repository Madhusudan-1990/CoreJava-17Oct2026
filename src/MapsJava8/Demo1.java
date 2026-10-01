package MapsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) 
	{
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		
		List<String> vehiclesInUpperCase = vehicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehiclesInUpperCase);

	}

}
