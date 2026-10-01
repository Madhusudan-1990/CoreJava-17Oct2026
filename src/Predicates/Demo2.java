package Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

//Lambda function validating object
class Employee
{
	String eName;
	int salary;
	int experience;
	
	Employee(String eName,int salary, int experience)
	{
		this.eName = eName;
		this.salary = salary;
		this.experience = experience;
		
	}
}

public class Demo2 {

	public static void main(String[] args) 
	{
		
		//Eg 1
		Employee emp = new Employee("John", 50000, 3);
		
		Predicate<Employee> pr = e->(e.salary>30000 && e.experience>3);
		pr.test(emp);
		
		//Eg 2
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("John", 50000, 5));
		al.add(new Employee("David", 29999, 2));
		al.add(new Employee("Mike", 30000, 3));
		al.add(new Employee("Scott", 40000, 6));
		
		for(Employee e : al)
		{
			if(pr.test(e))
			{
				System.out.println(e.eName + "------- " +e.salary);
			}
		}
		
		

	}

}
