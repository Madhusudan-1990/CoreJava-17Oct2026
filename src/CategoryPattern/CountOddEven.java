package CategoryPattern;

public class CountOddEven 
{
	private static void getCountOddEven(String message)
	{
		char [] arr = message.toCharArray();
		int evenDigits = 0;
		int oddDigits = 0;
		boolean isDigit;
		int digit;
		for(int i = 0; i<arr.length;i++)
		{
			isDigit = (arr[i]>='0' && arr[i]<='9');
			digit = arr[i]-'0';
			if(isDigit)
			{
				if(digit%2!=0)
				{
					oddDigits++;
	
				}
				else
				{
					evenDigits++;
						
				}
			
			}
		}
		System.out.println("Odd Digits Count : "+oddDigits);
		System.out.println("Even Digits Count : "+evenDigits);
	}

	public static void main(String[] args) 
	{
		getCountOddEven("Auto203GPT45");

	}

}
