package Predicates;

import java.util.function.Predicate;

//Joining Predicates

//P1 - > Check if number is even
//P2 - > Check if number is greater than 50

public class MultiplePredicates {

	public static void main(String[] args) 
	{
		int a[] = {5,10,15,20,25,30,35,40,55,50,55,60,65};
		
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>50;
		
		//and
		
		for(int n : a)
		{
//			if(p1.test(n)&& p2.test(n)) // This is also correct
			if(p1.and(p2).test(n)) // This is Joining of Predicates
			{
				System.out.println("Number satisfying both conditions are : "+n);
			}
		}
		
		//or
		for(int n : a)
		{
//			if(p1.test(n)&& p2.test(n)) // This is also correct
			if(p1.or(p2).test(n)) // This is Joining of Predicates
			{
				System.out.println("Number satisfying both conditions are : "+n);
			}
		}
		
		//negate
		for(int n : a)
		{
			if(p1.negate().test(n))
			{
				System.out.println("Negate of P1 : "+n);
			}
		}
		
		
	}

}
