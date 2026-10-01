package Suppliers;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {

	public static void main(String[] args) 
	{
		Supplier<Date> s = ()-> new Date(); // Supplier will not take any input but returns something. Here supplier has only Date as return type. Supplier<Date> where Date is return type.
		
		System.out.println(s.get());

	}

}
