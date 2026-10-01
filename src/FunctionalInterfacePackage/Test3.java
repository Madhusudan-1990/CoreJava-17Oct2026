package FunctionalInterfacePackage;


interface Cab3
{
	public String bookCab(String source, String destination);
}

//class Ola implements Cab3
//{
//	public String bookCab(String source, String destination)
//	{
//		System.out.println("Ola cab is booked from "+source+ " to " +destination);
//		return ("Price is 500rs");
//	}
//}
public class Test3 
{
	
	public static void main(String[] args) 
	{
		Cab3 cab = ( source,  destination)->{System.out.println("Ola cab is booked from "+source+ " to " +destination);
		return ("Price is 500rs");
	};
		System.out.println(cab.bookCab("Bang", "Hyd"));  

	}

}
