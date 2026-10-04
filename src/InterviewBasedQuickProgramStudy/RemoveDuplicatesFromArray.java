package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 30};

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}
