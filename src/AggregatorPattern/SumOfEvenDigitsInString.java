package AggregatorPattern;

public class SumOfEvenDigitsInString 
{

	private static int getSumOfEvenDigitsInString(String input)
	{
		char[] arr = input.toCharArray();
		int sumEvenDigits = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			boolean isLetter = (arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z');
			int evenDigit = arr[i]-'0';
			if(isDigit && evenDigit%2 == 0 && !isLetter)
			{
				sumEvenDigits = sumEvenDigits + evenDigit;
			}
		}
		
		return sumEvenDigits;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(getSumOfEvenDigitsInString("Auto203GPT45"));
	}

}
