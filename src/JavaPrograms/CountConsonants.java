package JavaPrograms;

public class CountConsonants {

	
	private static int countConsonants(String input)
	{
		int count = 0;
		
		char[] inputArray = input.toUpperCase().toCharArray();
		for(int i =0; i<inputArray.length;i++)
		{
			if(inputArray[i]!='A' && inputArray[i]!='E' && inputArray[i]!='I' && inputArray[i]!='O' && inputArray[i]!='U')
			{
				count++;
			}
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(countConsonants("MADHU"));
	}

}
