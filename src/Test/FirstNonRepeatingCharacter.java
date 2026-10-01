package Test;

public class FirstNonRepeatingCharacter 
{
	private static char findFirstNonRepeatingCharacter(String input)
	{
		char[] arr = input.toCharArray();
		
		
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isRepeating = false;
			for(int j = 0 ; j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					isRepeating = true;

					
				}
				
			}
			if(!isRepeating)
			{
				return arr[i];
			}
			
			
			}
		
		return 0;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(findFirstNonRepeatingCharacter("rgramoamingp"));

	}

}
