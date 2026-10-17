package Java8MethodReferences;

@FunctionalInterface
interface ReferenceToStaticMethodInterface
{
	public void test();
}
public class ReferenceToStaticMethod 
{
	public static void display()
	{
		System.out.println("Hello this is static method");
	}

	public static void main(String[] args) 
	{
		ReferenceToStaticMethodInterface ri = ReferenceToStaticMethod::display;
		ri.test();

	}

}
