package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsFirstNonRepeatingCharacterUsingStreams {

    public static void main(String[] args) {

        String input = "swiss";

//        Character result =
//                input.chars()
//                     .mapToObj(c -> (char) c)
//                     .collect(Collectors.groupingBy(
//                         Function.identity(),
//                         LinkedHashMap::new,
//                         Collectors.counting()
//                     ))
//                     .entrySet()
//                     .stream()
//                     .filter(entry -> entry.getValue() == 1)
//                     .map(Map.Entry::getKey)
//                     .findFirst()
//                     .orElse(null);
//
//        System.out.println(result);
        
        Map<Character, Long> occurance  = input.chars()
        								.mapToObj(c->(char) c)
        								.collect(Collectors
        										.groupingBy(Function.identity(),Collectors.counting()));
        
			 Character nonRepeatedChar = occurance.entrySet().stream()
						        	.filter(entry->entry.getValue()==1)
						        	.map(entry->entry.getKey())
						        	.findFirst()
						        	.orElse(null);
			 
			 System.out.println(nonRepeatedChar);
    }
}