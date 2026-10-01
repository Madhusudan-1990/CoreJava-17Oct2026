package JavaPrograms;

public class SecondLargestElement 
{
	private static void findSecondLargestElement()
	{
		int arr[] = {5, 90, 8, 85, 80};
		int max = 0;
		int secondMax = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
				
			}
		}
		for(int j = 0; j<arr.length;j++)
		{
			if(arr[j]<max && arr[j]>secondMax )
			{
				secondMax = arr[j];
			}
		}
		System.out.println(secondMax);
	}

	public static void main(String[] args) 
	{
		findSecondLargestElement();

	}

}
