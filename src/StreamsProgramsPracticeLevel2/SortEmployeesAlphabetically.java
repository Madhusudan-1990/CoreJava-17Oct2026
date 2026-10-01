package StreamsProgramsPracticeLevel2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Sort employees alphabetically by employee name and return a List<Employee2>.
 */
public class SortEmployeesAlphabetically {

	public static void main(String[] args) 
	{
		List<Employee2> employees = Arrays.asList(
			    new Employee2("John", 35, 75000.50),
			    new Employee2("David", 42, 82000.75),
			    new Employee2("Alice", 29, 68000.25),
			    new Employee2("Robert", 38, 91000.90)
			);
		
	  List<Employee2> empSorted = employees.stream().sorted(Comparator.comparing(Employee2::getName)).collect(Collectors.toList());
	  empSorted.forEach(System.out::println);

	}

}
