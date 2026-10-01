package FunctionsInterFace;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) 
	{
		Function<Integer, Integer> f1 = n->n*2;
		
		Function<Integer, Integer> f2 = n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2)); // 64 Here f1 will be executed and then f2
		System.out.println(f1.andThen(f2).apply(2)); // 16 Here f2 will be executed first and then f1
		


	}

}
