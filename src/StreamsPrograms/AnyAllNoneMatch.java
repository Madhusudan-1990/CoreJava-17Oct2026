package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class AnyAllNoneMatch {

	public static void main(String[] args) 
	{
		
		List<Integer> nums = Arrays.asList(2, 4, 6, 8, 10);
		
	  boolean b1 =	 nums.stream().anyMatch(s->s%2!=0);
	  boolean b2 = nums.stream().allMatch(n->n%2==0);
	  boolean b3 =nums.stream().noneMatch(n->n<0);
	  
	  System.out.println(b1);
	  System.out.println(b2);
	  System.out.println(b3);
		

	}

}
