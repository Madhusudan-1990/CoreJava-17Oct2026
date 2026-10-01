package Test;

public class FirstNonRepeatingDigit 
{
	private static int findFirstNonRepeatingDigit(String input)
	{
		char [] arr = input.toCharArray();
		
		for(int i = 0;i<arr.length;i++)
		{
			boolean isRepeating = false;
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			
			
			for(int j = 0; j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					isRepeating = true;
				}
			}
			if(!isRepeating && isDigit)
			{
				return arr[i]-'0';
			}
			
			
		}
		
		return 0;
	}

	public static void main(String[] args) 
	{
		System.out.println(findFirstNonRepeatingDigit("abc1122334055"));

	}

}
