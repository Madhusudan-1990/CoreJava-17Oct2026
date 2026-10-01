package CounterPattern;

public class CountVowels 
{
	
	public static int getVowelsCount(String input)
	{
		char[] vowels = input.toCharArray();
		
		int vowelsCount = 0;
		for(int i =0;i<vowels.length;i++)
		{
			if(vowels[i]=='a'|| vowels[i]=='e'||vowels[i]=='i'||vowels[i]=='o'||vowels[i]=='u' ||
					vowels[i]=='A'|| vowels[i]=='E'||vowels[i]=='I'||vowels[i]=='O'||vowels[i]=='U' )
			{
				vowelsCount++;
			}
		}
		return vowelsCount;
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Vowels Count : "+getVowelsCount("Automation"));

	}

}
