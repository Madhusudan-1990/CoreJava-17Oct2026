package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElement {

    public static void main(String[] args) {

        // Create a list containing duplicate elements
        List<String> items = Arrays.asList("a", "b", "c", "c", "a", "c");

        // Step 1: Convert the list into a Stream
        String mostFrequent = items.stream()

                // Step 2: Group identical elements and count their occurrences
                .collect(Collectors.groupingBy(
                        Function.identity(),       // Use each element itself as the Map key
                        Collectors.counting()      // Count occurrences of each element
                ))

                // The resulting Map conceptually contains: {a=3, b=2, c=1}

                // Step 3: Convert the Map entries into a Stream
                .entrySet().stream()

                // Step 4: Find the entry with the highest count
                .max(Map.Entry.comparingByValue())

                // Step 5: Extract the key (element) from the entry with the highest count
                .map(Map.Entry::getKey)

                // Step 6: If the list is empty, return null instead of throwing an exception
                .orElse(null);

        // Print the most frequent element
        System.out.println(mostFrequent);
    }
}