package JavaPrograms;

public class NumberOfWords 
{
	
	public  static int numberOfWords(String message)
	{
		String[] input = message.trim().split("\\s+");
		
		int count = input.length;
		if(message == null || message.trim().isEmpty())
		{
			return 0;
		}
	
		return count;
	}

	public static void main(String[] args) 
	{
		System.out.println(numberOfWords(" I love      automation testing     "));
		
	}

}
