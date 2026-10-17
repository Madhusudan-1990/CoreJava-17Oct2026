package InterviewBasedQuickProgramStudy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEachWordInString {

    private static void reverseEachWordInAString(String message) {

        // Step 1: Split the input sentence into an array of words
        String[] words = message.split(" ");

        // Step 2: Generate indexes from 0 to words.length - 1
        String result = IntStream.range(0, words.length)

                // Step 3: Access the array elements in reverse order
                .mapToObj(i -> words[words.length - 1 - i])

                // Step 4: Join the reversed words into a single String
                .collect(Collectors.joining(" "));

        // Step 5: Print the final result
        System.out.println(result);
    }

    public static void main(String[] args) {

        // Step 6: Call the method with the input sentence
        reverseEachWordInAString("Java is awesome");
    }
}