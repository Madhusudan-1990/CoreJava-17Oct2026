package Test;

public class FirstDigitInCharacter 
{
	private static char getFirstDigitInCharacter(String input)
	{
		char [] arr = input.toCharArray();
		
	
		for(int i= 0; i<arr.length;i++ )
		{
			boolean isDigit = (arr[i] >='0' && arr[i]<='9');
		
				if(isDigit)
				{
					
					return  arr[i];
				}
			
			
		}
		return 0;
		
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println(getFirstDigitInCharacter("Java2026"));

	}

}
