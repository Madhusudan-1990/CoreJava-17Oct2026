package ChampionPattern;

public class SmallestNumber 
{
	
	public static int findSmallestNumber()
	{
		int[] challenger = {8, 2, 15, 6, 9};
		
		int champion = challenger[0] ;
		
		for(int i = 1; i<challenger.length;i++)
		{
			if(challenger[i]<=champion)
			{
				champion = challenger[i];
			}
		}
		return champion;
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Smallet Number "+findSmallestNumber());

	}

}
