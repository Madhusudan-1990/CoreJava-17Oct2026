package FunctionalInterfacePackage;

@FunctionalInterface
interface Cab
{
	public void bookCab();
}

//class Ola implements Cab
//{
//	//Traditional Method
//	public void bookCab()
//	{
//		System.out.println("Ola cab is booked !!!");
//	}
//	
//	
//	
//}

public class Test 
{
	
	public static void main(String[] args) 
	{
		Cab cab = ()->System.out.println("Ola cab is booked !!!");
		cab.bookCab();

	}

}
