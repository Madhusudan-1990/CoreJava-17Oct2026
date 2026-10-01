package ChampionPattern;

public class LargestDigitInString 
{
	private static int findLargestDigitInString(String input)
	{
		char [] arr = input.toCharArray();
		
		int champion = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			if(isDigit)
			{
				int digit = arr[i]-'0';
				if(digit>champion)
				{
					champion = digit;
				}
			}
		}
		return champion;
	}

	public static void main(String[] args) 
	{
		System.out.println(findLargestDigitInString("Auto908GPT45"));
		
		
	}

}
