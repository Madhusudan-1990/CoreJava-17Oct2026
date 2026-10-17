package InterviewBasedQuickProgramStudy;

public class CheckPrimeNumber 
{
	private static int checkIfPrimeNumber(int num)
	{
		 boolean isPrime = true;

	        for (int i = 2; i < num; i++) 
	        {

	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if (isPrime) {
	            System.out.println(num + " is Prime");
	        } else {
	            System.out.println(num + " is Not Prime");
	        }
	        return num;
	}

    public static void main(String[] args) 
    {

    	checkIfPrimeNumber(71);
       
       
    }
}
