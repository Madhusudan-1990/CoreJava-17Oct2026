package CounterPattern;

public class CountUpperCase 
{
	private static int getCountOfUpperCase(String message)
	{
		char [] arr = message.toCharArray();
		int upperCaseCount=0;
		
		for(int i =0 ;i<arr.length;i++)
		{
			boolean isUpperCase = (arr[i]>='A' && arr[i]<='Z');
			if(isUpperCase)
			{
				upperCaseCount++;
			}
		}
		
		return upperCaseCount;
	}

	public static void main(String[] args) 
	{
		System.out.println(getCountOfUpperCase("Auto203GPT45"));

	}

}
