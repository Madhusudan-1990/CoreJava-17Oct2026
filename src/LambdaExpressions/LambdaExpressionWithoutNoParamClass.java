package LambdaExpressions;

interface LambdaExpressionWithoutNoParamInterface
{
	public String test();
}
public class LambdaExpressionWithoutNoParamClass
{

	public static void main(String[] args) 
	{
		LambdaExpressionWithoutNoParamInterface  lp = ()->{
			return " Welcome to the worlds of Java 8";
			
		};
		
		System.out.println(lp.test());

	}

}
