package LambdaExpressions;

interface LambdaExpressionWithMultipleParametersInterface
{
	public int test(int a, int b, int c);
}
public class LambdaExpressionWithMultipleParametersClass 
{

	public static void main(String[] args) 
	{
		LambdaExpressionWithMultipleParametersInterface lp = (a,b,c) -> {
		
			return a + b + c;
		};
		
		System.out.println(lp.test(3, 7, 5));

	}

}
