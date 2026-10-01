package JavaPrograms;

public class ReverseString 
{
	private static String reverseString(String input)
	{
		char[] inputArray = input.toCharArray();
		String result = "";
		for(int i = inputArray.length-1; i>=0; i--)
		{
			
			result = result+inputArray[i];
		}
		return result;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(reverseString("MADHU"));

	}
	
	

}
