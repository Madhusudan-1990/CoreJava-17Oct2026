package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionWithForeachLoopClass 
{

	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.asList(3,5,2,0,1,50,19);
		
		nums.forEach(n->System.out.println(n));

	}

}
