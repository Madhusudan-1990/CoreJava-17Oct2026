package SearchPattern;

public class FirstConsecutivePair 
{
	private static char getFirstConsecutivePair(String input)
	{
		char[] arr = input.toCharArray();
		
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[j];
				}
			}
		}
		return 0;
		
	}

	public static void main(String[] args) 
	{
		System.out.println(getFirstConsecutivePair("abcaabb"));

	}

}
