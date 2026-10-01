package ChampionPattern;

public class LongestWord 
{
	private static String findLongestString(String input)
	{
		char [] arr = input.toCharArray();
		String champion ="";
		String currentWord="";
		
		for(int i = 0;i<arr.length;i++)
		{
			boolean isSpace = (arr[i]==' ');
			boolean isLetter = (arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z');
			
			if(isLetter && !isSpace)
			{
				
					currentWord = currentWord+arr[i];
				
			}
				
				
			
			if(isSpace)
			{
			
				currentWord = "";
			}
			if(currentWord.length()>champion.length())
			{
				champion = currentWord;
			}
		}
		
		return champion;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(findLongestString("Java is an amazing programming language"));

	}

}
