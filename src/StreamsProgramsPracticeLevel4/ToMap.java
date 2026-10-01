package StreamsProgramsPracticeLevel4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee3
{
	public Employee3(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
	String ename;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;
	
}

public class ToMap {

	public static void main(String[] args) 
	{
		List<Employee3> employees =
			    Arrays.asList(
			        new Employee3("John", 50000),
			        new Employee3("David", 60000),
			        new Employee3("Mike", 70000)
			    );
		
	 Map<String, Integer> empDetails = employees.stream().collect(Collectors.toMap(Employee3::getEname,Employee3::getSalary));
	 System.out.println(empDetails);
	 
	 
		List<Employee3> employees1 =
			    Arrays.asList(
			        new Employee3("John", 50000),
			        new Employee3("David", 60000),
			        new Employee3("John", 70000)
			    );
		
		 Map<String, Integer> empDetails1 = employees1.stream()
				 							.collect(Collectors.toMap(
				 									Employee3::getEname,
				 									Employee3::getSalary,
				 									(salary1,salary2)->Math.max(salary1, salary2)));
		 									System.out.println(empDetails1);

	}

}
