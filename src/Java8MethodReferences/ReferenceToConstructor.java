package Java8MethodReferences;


interface ReferenceToConstructorInterface
{
	Message test(String message);
	
}
 class Message 
{
	 Message(String message) 
	{
		System.out.println(message);
	}
}
 public class ReferenceToConstructor{

	public static void main(String[] args) 
	{
		ReferenceToConstructorInterface refInt = Message::new;
		refInt.test("Hello");

	}

}
