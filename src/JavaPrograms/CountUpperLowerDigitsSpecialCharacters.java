package JavaPrograms;

public class CountUpperLowerDigitsSpecialCharacters 
{

	private static void getCountOfUpperLowerDigitsSpecialCharacters(String message)
	{
		

		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharacterCount = 0;
		
		char[] input = message.toCharArray();
		for(int i = 0; i< input.length;i++)
		{
			
			if(Character.isUpperCase(input[i]))
			{
				upperCaseCount++;
				
			}
			else if(Character.isLowerCase(input[i]))
			{
				lowerCaseCount++;
				
			}
			else if(Character.isDigit(input[i]))
			{
				digitCount++;
				
			}
			else
			{
				
				specialCharacterCount++;
				
			}
				
		}
		System.out.println("Uppercase : "+ upperCaseCount);
		System.out.println("Lowercase : " +lowerCaseCount);
		System.out.println("Digit : " +digitCount);
		System.out.println("Special : " + specialCharacterCount);
//		return count;
	}
	
	public static void main(String[] args) 
	{
		getCountOfUpperLowerDigitsSpecialCharacters("Java123@ChatGPT");

	}

}
