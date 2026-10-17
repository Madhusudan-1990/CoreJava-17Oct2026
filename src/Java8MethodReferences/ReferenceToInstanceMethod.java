package Java8MethodReferences;

@FunctionalInterface
interface ReferenceToInstanceMethodInterface
{
	public void test();
}
public class ReferenceToInstanceMethod 
{
	public void display()
	{
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) 
	{
		ReferenceToInstanceMethod r1 = new ReferenceToInstanceMethod();
		ReferenceToInstanceMethodInterface i1 = r1::display;
		i1.test();
		
		ReferenceToInstanceMethod r2 = new ReferenceToInstanceMethod();
		ReferenceToInstanceMethodInterface i2 = new ReferenceToInstanceMethod()::display;
		
		i2.test();
		
		

	}

}
