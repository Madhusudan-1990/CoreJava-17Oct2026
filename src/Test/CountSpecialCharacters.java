package Test;

public class CountSpecialCharacters 
{
	private static int getCountOfSpecialCharacters(String input)
	{
		char [] arr = input.toCharArray();
		
		int specialCharacterCount = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isLetter = (arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z');
			boolean isDigit = (arr[i]>='0' && arr[i]<='9');
			boolean isSpace = (arr[i]==' ');
			if(!isDigit && !isLetter && !isSpace)
			{
				specialCharacterCount++;
			}
		}
		
		return specialCharacterCount;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(getCountOfSpecialCharacters("Java@20 26#SDET!"));

	}

}
