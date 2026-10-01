package Test;

public class LastCharacterAppearingMoreThanOnce 
{
	
	private static char findLastCharacterAppearingMoreThanOnce(String input)
	{
		char [] arr = input.toCharArray();

		char lastRepeatingChar = ' ';
		boolean repeatingChar = false;
		
		for(int i = 0; i<arr.length;i++)
		{
			
			for(int j = i+1; j< arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					lastRepeatingChar = arr[i];
					repeatingChar = true;
					
				}
			}
			
		}
		if(repeatingChar)
		{
			return lastRepeatingChar;
		}
		
			return 0;
		
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println(findLastCharacterAppearingMoreThanOnce("programming"));

	}

}
