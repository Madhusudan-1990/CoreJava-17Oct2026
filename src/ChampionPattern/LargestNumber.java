package ChampionPattern;

public class LargestNumber 
{
	public static int findLargestNumber()
	{
		int[] challenger = {30,80,30,70,20};
		
		int champion = challenger[0];
		
		for(int i = 1; i<challenger.length;i++)
		{
			if(challenger[i]>champion)
			{
				champion = challenger[i];
			}
		}
		return champion;
	}

	public static void main(String[] args) 
	{
		System.out.println("Largest Number :"+findLargestNumber());
		
	}

}
