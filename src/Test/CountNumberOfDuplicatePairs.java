package Test;

public class CountNumberOfDuplicatePairs 
{
	private static int countNumberOfDuplicates(String input)
	{
		char[] arr = input.toCharArray();
		
		int count = 0;
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) 
	{
		System.out.println(countNumberOfDuplicates("aabbcc"));

	}

}
