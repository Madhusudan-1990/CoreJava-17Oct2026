package AggregatorPattern;

public class SumOfDigits 
{
	private static int getSumOfDigits(String input)
	{
		char[] arr = input.toCharArray();
		
		int sumOfDigits = 0;
		for(int i = 0; i<arr.length;i++)
		{
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			if(isDigit)
			{
				int digit = arr[i] - '0'; // Convert digit character to integer using ASCII/Unicode offset
				sumOfDigits = sumOfDigits + digit;
			}
		}
		return sumOfDigits;
	}

	public static void main(String[] args) 
	{
		System.out.println(getSumOfDigits("Auto203GPT45"));

	}

}
