package SearchPattern;

public class ContainsDigit 
{
	
	private static boolean isContainsDigit(String input)
	{
		boolean containsDigit = false;
		
		char [] arr = input.toCharArray();
		for(int i = 0; i<arr.length; i++)
		{
			containsDigit = (arr[i]>='0' && arr[i]<='9');
	
			if(containsDigit)
			{
				break;
				
			}
			
		}
		return containsDigit;
		
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println(isContainsDigit("AutoGPT"));

	}

}
