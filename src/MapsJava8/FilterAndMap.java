package MapsJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int empId;
	String empName;
	int salary;
	
	public Employee(int empId,String empName,int salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	
}
public class FilterAndMap {

	public static void main(String[] args) 
	{
//		List<Employee> employeeList = new ArrayList<Employee>();
//		employeeList.add(new Employee(101,"A",10000));
//		employeeList.add(new Employee(102,"B",20000));
//		employeeList.add(new Employee(103,"C",30000));
		
		//instead of above it can be optimized like below
		
		List<Employee> employeeList = Arrays.asList(
				new Employee(101,"A",10000),
				new Employee(102,"B",20000),
				new Employee(103,"C",30000),
		        new Employee(103,"D",40000),
                new Employee(103,"D",50000));
		
		//Combination of Filter + Map
		
		employeeList.stream()
		.filter(e->e.salary>20000)
		.map(e->e.salary)
		.collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
		
		

	}

}
