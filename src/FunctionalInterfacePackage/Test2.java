package FunctionalInterfacePackage;


interface Cab2
{
	public void bookCab(String source, String destination);
}

//class Ola implements Cab1
//{
//	public void bookCab(String source, String destination)
//	{
//		System.out.println("Ola cab is booked from "+source+ " to " +destination);
//	}
//}
public class Test2 
{
	
	public static void main(String[] args) 
	{
		Cab2 cab = (source,destination) -> System.out.println("Ola cab is booked from "+source+ " to " +destination);  
		cab.bookCab("Hyd", "Bang");

	}

}
