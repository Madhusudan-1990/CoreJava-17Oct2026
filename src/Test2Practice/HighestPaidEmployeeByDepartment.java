package Test2Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    @Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
public class HighestPaidEmployeeByDepartment {

	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "IT", 70000),
			    new Employee("Bob", "HR", 50000),
			    new Employee("Charlie", "IT", 90000),
			    new Employee("Diana", "HR", 60000),
			    new Employee("Eric", "IT", 80000),
			    new Employee("Fiona", "HR", 55000)
			);
		
			 Map<String, Optional<Employee>> highSal = employees.stream()
				.collect(Collectors
						.groupingBy(Employee::getDepartment,
							Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
			
			System.out.println(highSal);

	}

}
