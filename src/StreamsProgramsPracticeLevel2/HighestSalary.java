package StreamsProgramsPracticeLevel2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
/*
 * Find the employee with the highest salary using Streams.
 */
class Employee2 {
	 

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	String name;
    int age;
    double salary;

    Employee2(String name, int age, double salary) {
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
public class HighestSalary {

	public static void main(String[] args) 
	{
		List<Employee2> employees = Arrays.asList(
			    new Employee2("John", 35, 75000.50),
			    new Employee2("David", 42, 82000.75),
			    new Employee2("Alice", 29, 68000.25),
			    new Employee2("Robert", 38, 91000.90)
			);
		
	 Optional<Employee2> highestSal = employees.stream().max(Comparator.comparingDouble(Employee2::getSalary));
	 System.out.println(highestSal.get());

	}

}
