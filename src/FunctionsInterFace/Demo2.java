package FunctionsInterFace;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	
	Employee(String ename,int salary)
	{
		this.ename = ename;
		this.salary = salary;
	}
}

public class Demo2 {

	public static void main(String[] args) 
	{
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("A", 30000));
		emp.add(new Employee("B", 20000));
		emp.add(new Employee("C", 50000));
		
		Function<Employee,Integer> bonus = e->{
			
			int sal = e.salary;
			if(sal>=10000 && sal<=20000)
			
				return (sal * 10 /100);
			
			else if(sal>20000 && sal<=30000)
			
				return (sal * 20/100);
			
			else if(sal>30000 && sal<=50000)
			
				return (sal * 30/100);
			
			else
				return (sal * 40/100);
			
		}; 
		
		Predicate<Integer> p = b->b>5000;
		
		for(Employee employee:emp)
		{
			int bonusAmount = bonus.apply(employee); // Function Implementation
			if(p.test(bonusAmount))
			{// Predicate Implementation
				System.out.println(employee.ename + " ------- "+employee.salary);
				System.out.println("Bonus amount is "+bonusAmount);
			}
		}

	}

}
