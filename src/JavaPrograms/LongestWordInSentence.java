package JavaPrograms;

public class LongestWordInSentence 
{

	private static String getLongestWordInSentence(String message)
	{
		
		int messageCount = message.length();
		String currentWord="";
		String longestWord="";
		
		char[] ch = message.toCharArray();
		for(int i = 0; i<ch.length;i++)
		{
		
//			 System.out.println(ch[i]);
			 if(ch[i]!= ' ')
			 {
				currentWord = currentWord+ch[i];

				
			 }
			 if(ch[i]==' ' )
			 {
				 if(currentWord.length() > longestWord.length())
				 {
					 longestWord = currentWord;
					
				 }
				 currentWord = "";
				 longestWord = longestWord;
				 	
	
			 }		
			
		}
		 longestWord = currentWord;
		
		 return longestWord;
		
	
	}
	public static void main(String[] args) 
	{
		System.out.println(getLongestWordInSentence("Automation is Fun"));

	}

}
