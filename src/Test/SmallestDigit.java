package Test;

public class SmallestDigit 
{

	private static int findSmallestDigit(String input)
	{
		char[] arr = input.toCharArray(); 
		int champion = 0;
		boolean isDigit = false;
		boolean foundDigit = false;
		for(int i = 0; i<arr.length; i++)
		{
			 isDigit = (arr[i]>='0' && arr[i]<='9');
			
			if(isDigit)
			{
				int digit = arr[i] - '0';
				if(!foundDigit)
				{
					champion = digit;
					foundDigit = true;
				}
				else if(digit<champion)
				{
					champion = digit;
						
				}
				
			}
					
			
		}
		
		return champion;
		
			
		
	}

	public static void main(String[] args) 
	{
		
		System.out.println(findSmallestDigit("abcdef"));

	}

}
