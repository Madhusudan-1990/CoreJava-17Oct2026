package StreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee
{
	String ename;
	int salary;
	
	public Employee(String ename, int salary)
	{
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getSalary()
	{
		return salary;
	}
	public String getName()
	{
		return ename;
	}
	
	@Override
	public String toString() {
	    return "Employee{name='" + ename + "', salary=" + salary + "}";
	}
}

public class SortEmployeeBySalary 
{

	public static void main(String[] args) 
	{
		List<Employee> empList = Arrays.asList(new Employee("Ajay",30000),
											  new Employee("Vijay",60000),
											  new Employee("Sujay",70000));
		
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
				.reversed().thenComparing(Employee::getName)).forEach(System.out::println);
						

	}

}
