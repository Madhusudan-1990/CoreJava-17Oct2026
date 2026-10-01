package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctLimitCount {

	public static void main(String[] args) 
	{
		List<String>vehicleList = Arrays.asList("bus","car","scooter","boat","train","plane","bus","scooter","train");
		
		//distinct
		List<String>distinctVehicle = vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicle);
		
		// count
		long vehicleCount =vehicleList.stream().distinct().count();
		System.out.println(vehicleCount); //6
		
		//limit()
		
		vehicleList.stream().limit(3).collect(Collectors.toList()).forEach(System.out::println); // 3'
		
		vehicleList.stream().distinct().limit(2).collect(Collectors.toList()).forEach(v->System.out.println(v)); //2
		

	}

}
