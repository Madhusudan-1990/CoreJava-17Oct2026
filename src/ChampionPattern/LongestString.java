package ChampionPattern;

public class LongestString 
{
	public static String findLongestString()
	{
		String [] challenger = {"Java","Automation","SDET","InterviewPattern"};
		
		String champion = challenger[0];
		
		for(int i = 1; i<challenger.length;i++)
		{
			if(challenger[i].length()>champion.length())
			{
				champion = challenger[i];
			}
		}
		
		return champion;
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Longest String : "+findLongestString());

	}

}
