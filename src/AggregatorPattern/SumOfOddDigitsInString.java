package AggregatorPattern;

public class SumOfOddDigitsInString 
{
	
	private static int getSumOfOddDigitsInString(String message)
	{
		char [] arr = message.toCharArray();
		int sumOfOddNos = 0;
		for(int i = 0; i<arr.length;i++)
		{
			
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			int digit = arr[i]-'0';
			if(isDigit  && digit%2!=0)
			{
				sumOfOddNos = sumOfOddNos +digit;
			}
			
		}
		return sumOfOddNos;
	}

	public static void main(String[] args) 
	{
		System.out.println(getSumOfOddDigitsInString("Auto203GPT45"));

	}

}
