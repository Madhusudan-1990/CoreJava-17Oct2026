package Test;

public class SumOfDigitsInString 
{
	private static int getSumOfDigitsInString(String input)
	{
		char [] arr = input.toCharArray();
		
		int sumOfDigits = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			
			if(isDigit)
			{
				int digits = arr[i]-'0';
				if( digits%2!=0)
				{
				sumOfDigits = sumOfDigits+digits;
				}
			}
		}
		
		return sumOfDigits;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(getSumOfDigitsInString("abc2132579xyz"));

	}

}
