package JavaPrograms;

public class RemoveAllSpace 
{

	private static String removeAllSpaces(String message)
	{
		char[] input = message.trim().toCharArray();
		String result = "";
//		for(char ch : input)
//		{
//			if(ch!=' ')
//			{
//				
//				System.out.println(message.charAt(ch))); // Index Out Of Bound
//			}
//		}
		for(int i = 0; i<input.length;i++)
		{
			if(input[i]!=' ')
			{
				result = result+input[i];
				
//				System.out.println(result);
			}
		}
		
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println(removeAllSpaces("I love Java"));
		System.out.println(removeAllSpaces("    I love Java"));
		System.out.println(removeAllSpaces("I love Java     "));
		System.out.println(removeAllSpaces("I       love    Java"));
	

	}

}
