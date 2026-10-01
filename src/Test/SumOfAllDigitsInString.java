package Test;

public class SumOfAllDigitsInString 
{
	private static int sumOfDigitsInString(String input)
	{
		char [] arr = input.toCharArray();
		
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			int digit = arr[i]-'0';
			if(isDigit)
			{
				sum = sum + digit;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(sumOfDigitsInString("Java2026"));

	}

}
