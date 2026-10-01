package Test;

public class CountSpaces 
{
	private static int countSpacesInString(String input)
	{
		char [] arr = input.toCharArray();
		
		int countSpaces = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			boolean isSpaces = (arr[i]== ' ');
			if(isSpaces)
			{
				countSpaces++;
			}
		}
		return countSpaces;
	}

	public static void main(String[] args) 
	{
		System.out.println(countSpacesInString("Java Programming is Fun"));

	}

}
