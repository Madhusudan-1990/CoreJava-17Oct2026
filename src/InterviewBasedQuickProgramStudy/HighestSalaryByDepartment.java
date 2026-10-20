package InterviewBasedQuickProgramStudy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Highest Salary By Department
 */
class Employee4 {
    String name;
    String department;
    double salary;

    Employee4(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name +
               ", department=" + department +
               ", salary=" + salary + "]";
    }
}

public class HighestSalaryByDepartment 
{
	public static void main(String[] args) 
	{
		List<Employee4> employees = Arrays.asList(
			    new Employee4("John", "QA", 70000),
			    new Employee4("Alexander", "QA", 85000),
			    new Employee4("Bob", "Dev", 90000),
			    new Employee4("Christopher", "Dev", 105000),
			    new Employee4("Sam", "QA", 75000)
			);
		
		Map<String, Optional<Employee4>> collect = employees.stream().collect(Collectors.groupingBy(
				Employee4::getDepartment
				,Collectors.maxBy(Comparator.comparingDouble(Employee4::getSalary))));
		
		System.out.println(collect);

	}

}
