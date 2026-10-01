package Predicates;

import java.util.List;
import java.util.function.Predicate;

public class Demo1 {

	//Predicate ---> One Parameter and returns Boolean
	//Use only if you have conditional checks in your program
	
	public static void main(String[] args) 
	{
		//Eg1
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(12));//true
		
		System.out.println(p.test(4));//false
		
		//Eg2
		
		Predicate<String> pr = s->(s.length()>4);
		pr.test("Madhu");
		pr.test("Ani");
		
		//Eg 3 : Print array elements whose size is greater than 4 from Array
		
		String names[] = {"David","Scitt","Smith","John","Mary"};
		for(String name : names)
		{
			if(pr.test(name))
			{
				System.out.println(name);
			}
			
		}
		
		
	}

}
