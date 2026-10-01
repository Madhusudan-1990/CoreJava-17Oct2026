package CounterPattern;

public class CountDigits 
{
	public static int getDigitsCount(String input)
	{
		char [] digits = input.toCharArray();
		int countDigits = 0;
		
		for(int i = 0; i<digits.length;i++)
		{
			if(digits[i]<='9'&& digits[i]>='0')
			{
				countDigits++;
			}
		}
		return countDigits;
		
	}

	public static void main(String[] args) 
	{
		System.out.println(getDigitsCount("Auto2ma203#@tion"));

	}

}
