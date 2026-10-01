package JavaPrograms;

import java.util.Arrays;

public class Anagram 
{
	private static boolean isAnagram(String message1, String message2)
	{
		boolean flag = false;
		
		char[] ch1 = message1.toCharArray();
		char[] ch2 = message2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			flag = true;
			System.out.println("Strings are Anagram!!!");
		}
		else
		{
			System.out.println("Strings are not Anagram!!!");
		}
		
		return flag;
		
	}

	public static void main(String[] args) 
	{
		System.out.println(isAnagram("listen","silent"));

	}

}
