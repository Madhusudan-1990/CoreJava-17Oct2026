package InterviewBasedQuickProgramStudy;

public class FibonacciSeries {

	private static void findFibonacciForNum(int n)
	{
		int first = 0;
		int second = 1;
		
		for(int i = 1; i<=n; i++)
		{
			System.out.println(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}
	
	public static void main (String [] args)
	{
		findFibonacciForNum(10);
	}
}

