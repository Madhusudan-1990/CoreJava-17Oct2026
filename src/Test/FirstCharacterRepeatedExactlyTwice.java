package Test;

public class FirstCharacterRepeatedExactlyTwice 
{
	private static char findFirstCharacterRepeatedExactlyTwice(String input)
	{
		char [] arr = input.toCharArray();
		
		
		
		
		for(int i = 0; i<arr.length;i++)
		{
			int count = 0;
			boolean isRepeating = (arr[i]>='a' && arr[i]<='z');
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			
			if(count == 2)
			{
				
				return arr[i];
			}
		}
		
		return 0;
 	}

	public static void main(String[] args) 
	{
		System.out.println(findFirstCharacterRepeatedExactlyTwice("cabacdd"));

	}

}
