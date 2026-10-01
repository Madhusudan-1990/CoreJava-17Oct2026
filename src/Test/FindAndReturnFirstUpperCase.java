package Test;

public class FindAndReturnFirstUpperCase 
{
	private static char findFirstUpperCase(String input)
	{
		char [] arr = input.toCharArray();
		
		char firstUpperCase = ' ';
		
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isUpperCase = isUpperCase = (arr[i]>='A' && arr[i]<='Z');
			if(isUpperCase)
			{
				return arr[i];
			}
		}
		return 0;
		
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println(findFirstUpperCase("java Selenium TEST"));
		

	}

}
