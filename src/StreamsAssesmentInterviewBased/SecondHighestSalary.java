package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Find the second-highest unique salary.
 */

class Employee3 {
    @Override
	public String toString() {
		return "Employee3 [name=" + name + ", salary=" + salary + "]";
	}

	String name;
    double salary;

    Employee3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
public class SecondHighestSalary {

	public static void main(String[] args) 
	{
		List<Employee3> employees = Arrays.asList(
			    new Employee3("John", 75000),
			    new Employee3("David", 82000),
			    new Employee3("Alice", 68000),
			    new Employee3("Robert", 91000),
			    new Employee3("Mark", 82000)
			);
		Double secondHighestSalary = employees.stream().map(Employee3::getSalary)
						  .distinct()
						  .sorted(Comparator.reverseOrder())
						  .skip(1)
						  .findFirst()
						  .orElse(0.0);
		
		System.out.println(secondHighestSalary);
								  
	
	}

}
