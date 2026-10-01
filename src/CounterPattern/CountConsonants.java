package CounterPattern;

public class CountConsonants 
{
	public static int getConsonantsCount(String input)
	{
		char[] consonants = input.toCharArray();
		
		int consonantsCount = 0;
		for(int i =0;i<consonants.length;i++)
		{
			if(consonants[i]!='a'&& consonants[i]!='e'&& consonants[i]!='i'&& consonants[i]!='o'&& consonants[i]!='u' &&
					consonants[i]!='A'&& consonants[i]!='E'&& consonants[i]!='I'&& consonants[i]!='O' && consonants[i]!='U' )
			{
				consonantsCount++;
			}
		}
		return consonantsCount;
	}

	public static void main(String[] args) {
		System.out.println("Vowels Count : "+getConsonantsCount("Automation"));

	}

}
