package Test;

public class DuplicateCharacter 
{
	private static boolean isThereDuplicateCharacter(String input)
	{
		char[] arr = input.toCharArray();
		
		boolean isDuplicate = false;
		
		for(int i = 0; i< arr.length;i++)
		{
			for(int j = 0; j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					isDuplicate = true;
				}
			}
		}
		
		return isDuplicate;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(isThereDuplicateCharacter("abcdeff"));

	}

}
