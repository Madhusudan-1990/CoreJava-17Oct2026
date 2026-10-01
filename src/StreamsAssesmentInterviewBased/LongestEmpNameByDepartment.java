package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Return:
	Map<String, String>
	containing the longest employee name in each department.
 */
class Employee4 {
    @Override
	public String toString() {
		return "Employee4 [name=" + name + ", department=" + department + "]";
	}

	String name;
    String department;

    Employee4(String name, String department) {
        this.name = name;
        this.department = department;
    }

    String getName() {
        return name;
    }

    String getDepartment() {
        return department;
    }
}
public class LongestEmpNameByDepartment {

	public static void main(String[] args) 
	{
		List<Employee4> employeeList = Arrays.asList(
			    new Employee4("John", "QA"),
			    new Employee4("Alexander", "QA"),
			    new Employee4("Bob", "Dev"),
			    new Employee4("Christopher", "Dev"),
			    new Employee4("Sam", "QA")
			);
		Map<String, Optional<Employee4>> collect = employeeList.stream().collect(
				Collectors.groupingBy(Employee4::getDepartment,
					Collectors.maxBy(Comparator.comparing(s->s.getName().length()))));
		
		System.out.println(collect);
	
	 
	}

}
