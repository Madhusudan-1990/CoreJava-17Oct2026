package Test;

public class FirstRepeatingCharacter 
{
	
	private static char findFirstRepeatingCharacter(String input)
	{
		char [] arr = input.toCharArray();
		
		char firstRepeatingCharacter = ' ';
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					firstRepeatingCharacter = arr[j];
					return firstRepeatingCharacter;
					
				}
				
			}
		}
		
		return 0;
	}

	public static void main(String[] args) 
	{
		System.out.println(findFirstRepeatingCharacter("abcdef"));

	}

}
