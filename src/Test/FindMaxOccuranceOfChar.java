package Test;

public class FindMaxOccuranceOfChar 
{

	private static char findMaxNoOfOccurance(String input)
	{
		char [] arr = input.toCharArray();
		
		int currentCount = 0;
		int championCount = 0;
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					championCount++;
					if(championCount>currentCount)
					{
						return arr[i];
					}
					
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(findMaxNoOfOccurance("mprogrammingm"));

	}

}
