package WithOutLambdaStreams;

public class NonFPImplementationClass implements NonFunctionalProgrammingInterface
{
	public void draw()
	{
		System.out.println("Drawing the circle");
	}

	public static void main(String[] args) 
	{
		
		NonFunctionalProgrammingInterface nFP = new NonFPImplementationClass();
		nFP.draw();
		

	}

}
