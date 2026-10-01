package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
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

    public double getSalary() {
        return salary;
    }
}
public class EmployeeAverageSalaryByDepartment {

	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(
			    new Employee("John", "QA", 70000),
			    new Employee("David", "QA", 80000),
			    new Employee("Alice", "Dev", 90000),
			    new Employee("Robert", "Dev", 100000),
			    new Employee("Mark", "QA", 75000)
			);
		
	Map<String, Double> salAvg = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(salAvg);

	}

}
