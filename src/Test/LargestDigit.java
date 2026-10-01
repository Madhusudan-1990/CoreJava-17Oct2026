package Test;

public class LargestDigit 
{
	
	private static int findLargestDigit(String input)
	{
		char [] arr = input.toCharArray();
		
		int champion = 0;
		
		for(int i = 1; i < arr.length; i++)
		{
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			int digit = arr[i]-'0';
			if(isDigit)
			{
				if(champion<digit)
				{
					champion = digit;
				}
			}
		}
		return champion;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(findLargestDigit("Auto98582721"));

	}

}
