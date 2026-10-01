package JavaPrograms;

public class FirstNonRepeatingCharacter 
{
	
	private static char getFirstNonRepeatingCharacter(String message)
	{

		int count;
		char[] input = message.toCharArray();
		
		for(int i = 0; i<input.length;i++)
		{
			count = 0;
//			result = result + input[i];
			for(int j = 0; j<input.length;j++)
			{
				if(input[i] == input[j])
				{
					count++;
				}
			
			}
			if(count ==1)
			{
				return input[i];
			}
			
		 
		}
		return 0;
		

	}

	public static void main(String[] args) 
	{
		System.out.println(getFirstNonRepeatingCharacter("swiss"));

	}

}
