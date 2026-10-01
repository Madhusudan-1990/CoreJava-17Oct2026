package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreams {

	public static void main(String[] args) 
	{
		List<String> animalsList = Arrays.asList("Dog","Cat","Elephant");
		List<String> birdsList = Arrays.asList("peacock","parrot","crow");
		
		Stream<String> animalStream = animalsList.stream();
		Stream<String> birdsStream = birdsList.stream();
		
		Stream.concat(animalStream,birdsStream).collect(Collectors.toList()).forEach(System.out::println);

	}

}
