package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsFirstNonRepeatingCharacterUsingStreams {

	  private static void findFirsNonRepeatingCharacter(String input) {

	        // Step 1: Count the occurrences of each character
	        Map<Character, Long> occurrence = input.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(
	                        Function.identity(),
	                        Collectors.counting()
	                ));

	        // Step 2: Traverse the original string to find
	        // the first character whose count is 1
	        Character firstNonOccurrence = input.chars()
	                .mapToObj(c -> (char) c)
	                .filter(ch -> occurrence.get(ch) == 1)
	                .findFirst()
	                .orElse(null);

	        // Step 3: Print the result
	        System.out.println("Input: " + input);
	        System.out.println("First non-repeating character: "
	                + firstNonOccurrence);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        findFirsNonRepeatingCharacter("swiss");
	        findFirsNonRepeatingCharacter("sssiw");
	        findFirsNonRepeatingCharacter("aabbcdde");
	        findFirsNonRepeatingCharacter("aabbcc");
	        findFirsNonRepeatingCharacter("aabbcde");
	    }
}