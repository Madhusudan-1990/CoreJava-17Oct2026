package LambdaExpressions;

interface LambdaExpressionWithoutReturnKeywordInterface
{
	public int addable(int a, int b);
}
public class LambdaExpressionWithoutReturnKeywordClass 
{

	public static void main(String[] args) 
	{
		LambdaExpressionWithoutReturnKeywordInterface lp = (a,b) -> (a+b);
		
		System.out.println(lp.addable(10, 30));
	}

}
