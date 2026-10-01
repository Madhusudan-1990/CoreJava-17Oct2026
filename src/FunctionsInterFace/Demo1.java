package FunctionsInterFace;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) 
	{
		Function<Integer,Integer> f = n->n*n;
		System.out.println(f.apply(5)); //25
		System.out.println(f.apply(10)); //100
		
		//String Length(String -->Length-->Int)
		
		Function<String, Integer> f1 = s->s.length();
		System.out.println(f1.apply("Madhusudan")); // 10
	
	}

}
