package Test;

public class CountDigits 
{
	private static int countDigits(String input)
	{
		char [] arr = input.toCharArray();
		int count = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			if(isDigit)
			{
				count++;
			}
				
				
		}
		
		return count;
	
	}

	public static void main(String[] args) 
	{
		System.out.println(countDigits("Java2026SDET 0"));

	}

}
