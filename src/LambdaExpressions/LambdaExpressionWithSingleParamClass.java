package LambdaExpressions;

interface LambdaExpressionWithSingleParamInterface
{
	public String test(String name);
}
public class LambdaExpressionWithSingleParamClass 
{

	public static void main(String[] args) 
	{
		LambdaExpressionWithSingleParamInterface lp = (name)->{
			return  "Hello "+ name;
		};
		
		System.out.println(lp.test("Madhu"));

	}

}
