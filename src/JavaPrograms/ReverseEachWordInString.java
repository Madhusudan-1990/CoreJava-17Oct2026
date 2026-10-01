package JavaPrograms;

public class ReverseEachWordInString 
{

	private static String reverseEachWordInAString(String message)
	{
	
		String reverseEachWord = "";
		
		String[] input  = message.split(" ");
		
		for(int i = 0; i<input.length; i++)
		{
//			reverseEachWord = reverseEachWord +" "+input[i];
			char[] ch = input[i].toCharArray();
			for(int j = ch.length-1; j>=0;j--)
			{
				reverseEachWord = reverseEachWord + " " + ch[j];
			}
			
		}
		
		return reverseEachWord;
		
	}
	public static void main(String[] args) 
	{
	
		System.out.println(reverseEachWordInAString("Java is awesome"));

	}

}
