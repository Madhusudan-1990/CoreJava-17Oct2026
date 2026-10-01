package StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1
{
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	int id;
	int salary;
	String dept;
	
	public Employee1(int id, int salary, String dept) {
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}


	
	

	
	
}

public class SumSalariesByDept 
{
	public static void main(String[] args) 
	{
		List<Employee1> empList = Arrays.asList(new Employee1(101,20000,"ISE"),
											   new Employee1(102,40000,"MECH"),
											   new Employee1(103,30000,"CSE"),
											   new Employee1(104,60000,"CIVIL"),
											   new Employee1(103,100000,"MECH"),
											   new Employee1(105,30000,"ISE"));
		
		Map<String, Double> emp = empList.stream().collect(Collectors.groupingBy(Employee1::getDept,
				                 Collectors.summingDouble(Employee1::getSalary)));
		
		System.out.println(emp);

	}

}
