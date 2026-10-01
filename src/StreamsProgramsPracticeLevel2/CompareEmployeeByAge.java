package StreamsProgramsPracticeLevel2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
 * Find the oldest employee using Streams.
 */
class Employee {
    @Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class CompareEmployeeByAge {

	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(
			    new Employee("John", 35, 75000),
			    new Employee("David", 42, 82000),
			    new Employee("Alice", 29, 68000),
			    new Employee("Robert", 38, 91000)
			);
		
	     Optional<Employee> oldEmp = employees.stream().max(Comparator.comparingInt(Employee::getAge));
	     System.out.println(oldEmp.get());

	}

}
