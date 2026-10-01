package Test;

public class SecondLargestDigit 
{
	private static int getSecondLargestNumber()
	{
		int arr[] = {2,9,3,0,32,23,39};
		
		int champion = arr[0];
		
		for(int i = 1; i<arr.length;i++)
		{
			if(champion<arr[i])
			{
				champion = arr[i];
				
			}
		}
		
		return champion;
	}

	public static void main(String[] args) 
	{
		System.out.println(getSecondLargestNumber());

	}

}
