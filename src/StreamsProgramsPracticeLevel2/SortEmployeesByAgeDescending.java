package StreamsProgramsPracticeLevel2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Sort all employees by age in descending order and return a List<Employee>.
 */
class Employee1 {
 

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	String name;
    int age;
    double salary;

    Employee1(String name, int age, double salary) {
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
public class SortEmployeesByAgeDescending 
{

	public static void main(String[] args) 
	{
		List<Employee1> employees = Arrays.asList(
			    new Employee1("John", 35, 75000),
			    new Employee1("David", 42, 82000),
			    new Employee1("Alice", 29, 68000),
			    new Employee1("Robert", 38, 91000)
			);
		
	  List<Employee1> empAge = employees.stream().sorted(Comparator.comparingInt(Employee1::getAge).reversed()).collect(Collectors.toList());
	 System.out.println(empAge);

	}
}
