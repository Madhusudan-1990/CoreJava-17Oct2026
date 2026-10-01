package StreamsPrograms;

import java.util.*;
import java.util.stream.*;

public class TransformListToMap {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 70000),
            new Employee("Bob",   80000),
            new Employee("Carol", 50000)
        );

        // Map<Name, Salary>
        Map<String, Integer> nameToSalary = employees.stream()
            .collect(Collectors.toMap(
                Employee::getName,
                Employee::getSalary));

        nameToSalary.forEach((name, sal) ->
            System.out.println(name + " => " + sal));

        // Handle duplicate keys — keep higher salary
        List<Employee> withDuplicates = Arrays.asList(
            new Employee("Alice", 70000),
            new Employee("Alice", 90000),  // duplicate name
            new Employee("Bob",   80000)
        );

        Map<String, Integer> deduped = withDuplicates.stream()
            .collect(Collectors.toMap(
                Employee::getName,
                Employee::getSalary,
                (sal1, sal2) -> Math.max(sal1, sal2)));  // merge function

        deduped.forEach((name, sal) ->
            System.out.println(name + " => " + sal));
        // Alice => 90000.0
        // Bob   => 80000.0
    }
}