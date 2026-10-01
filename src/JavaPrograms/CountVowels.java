package JavaPrograms;

public class CountVowels 
{
    
	private  static int countVowels(String input)
	{
		int count = 0;
		
		char[] inputArray = input.toCharArray();
		for(int i = 0; i<inputArray.length; i++)
		{
			
			if(inputArray[i]=='a' || inputArray[i]=='e' || inputArray[i]=='i' || inputArray[i]=='o' || inputArray[i]=='u')
			{
				count++;
				
			}
		}
		
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(countVowels("aeiou"));

	}

}
