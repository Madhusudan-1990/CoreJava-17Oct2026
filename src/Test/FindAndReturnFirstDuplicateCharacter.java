package Test;

public class FindAndReturnFirstDuplicateCharacter 
{
	private static char findAndReturnFirstDuplicateCharacterInString(String input)
	{
		char[] arr = input.toCharArray();
		
		char firstDuplicateCharacter = ' ';
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					firstDuplicateCharacter = arr[i];
					return firstDuplicateCharacter;
					
				}
			}
			
		}
		return 0;
		
	}

	public static void main(String[] args) 
	{
		
		System.out.println(findAndReturnFirstDuplicateCharacterInString("swiss"));

	}

}
