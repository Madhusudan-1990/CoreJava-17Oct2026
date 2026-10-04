package InterviewBasedQuickProgramStudy;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsCharacterFrequency {

    public static void main(String[] args) {

        String input = "automation";

        Map<Character, Long> characterCount =
                input.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(
                             Function.identity(),
                             Collectors.counting()
                     ));

        System.out.println(characterCount);
    }
}
