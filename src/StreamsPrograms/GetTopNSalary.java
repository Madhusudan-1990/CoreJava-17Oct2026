package StreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee2
{
	int empSalary;
	
	@Override
	public String toString() {
		return "Employee2 [empSalary=" + empSalary + "]";
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Employee2(int empSalary)
	{
		this.empSalary = empSalary;
	}
}
public class GetTopNSalary {

	public static void main(String[] args) 
	{
		
		List<Employee2> empList = Arrays.asList(new Employee2(30000),
				                                new Employee2(50000),
				                                new Employee2(60000),
				                                new Employee2(20000),
				                                new Employee2(70000),
				                                new Employee2(60000));
		
    List<Employee2>topNSalary = empList.stream().sorted(Comparator.comparingDouble(Employee2::getEmpSalary).reversed()).	limit(3).collect(Collectors.toList());
    System.out.println(topNSalary);

	}

}
