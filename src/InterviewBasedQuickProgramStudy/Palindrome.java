package InterviewBasedQuickProgramStudy;

public class Palindrome {
	
	private static boolean isPalindrome(String input)
	{
		boolean flag = false;
		String reverseString = "";
		char [] reverseArray = input.toCharArray();
		for(int i = reverseArray.length-1;i>=0;i--)
		{
			reverseString = reverseString + reverseArray[i];
			
			
		}
		if(input.equals(reverseString))
		{
			flag = true;
		
		}
		else
		{
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) 
	{
		System.out.println(isPalindrome("MADAM"));
		
	}

}
