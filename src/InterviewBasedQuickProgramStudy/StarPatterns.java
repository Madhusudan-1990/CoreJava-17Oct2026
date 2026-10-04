package InterviewBasedQuickProgramStudy;

public class StarPatterns {

	// Right-angle triangle
	public static void triangle(int n) 
	{
		for (int row = 1; row <= n; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	// Inverted triangle
	public static void invertedTriangle(int n) 
	{
		for (int row = n; row >= 1; row--) 
		{
			for (int col = 1; col <= row; col++) 
			{
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	// Number triangle
	public static void numberTriangle(int n) 
	{
		for (int row = 1; row <= n; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{ 
		triangle(5); 
		
		invertedTriangle(5);
		
		numberTriangle(5);
		
	}
	
}


