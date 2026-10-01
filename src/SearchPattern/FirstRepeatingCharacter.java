package SearchPattern;

public class FirstRepeatingCharacter 
{
	private static char findFirstRepeatingCharacter(String input)
	{
		char arr[] = input.toCharArray();
		
		for(int i = 0; i<arr.length;i++)
		{
			
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
					
				}
				
			}
		}
		return 0;
		
	}

	public static void main(String[] args) 
	{
		System.out.println(findFirstRepeatingCharacter("abbbvcdddee"));

	}

}
