package Day1;

public class Employee {
	
	String employeeName;
	int employeeId;
	double salary;
	String department;
	boolean isPermanent;
	
	public Employee(String employeeName,int employeeId,double salary,String department,boolean isPermanent)
	{
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.department = department;
		this.isPermanent = isPermanent;
	}

	public static void main(String[] args) 
	{
		
		Employee emp1 = new Employee("Madhu",01,30200.0,"ISE",false);
		System.out.println("Employee 1");
		System.out.println(emp1.employeeName);
		System.out.println(emp1.employeeId);
		System.out.println(emp1.salary);
		System.out.println(emp1.department);
		System.out.println(emp1.isPermanent);
		
		Employee emp2 = new Employee("Vasudha",02,60200.0,"CSE",true);
		System.out.println("Employee 2");
		System.out.println(emp2.employeeName);
		System.out.println(emp2.employeeId);
		System.out.println(emp2.salary);
		System.out.println(emp2.department);
		System.out.println(emp2.isPermanent);
		
		
		
		


	}

}
