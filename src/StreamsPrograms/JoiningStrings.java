package StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {

	public static void main(String[] args) 
	{
		 List<String> names = Arrays.asList("Alice","Bob","Carol","Dave");
		 
		 // Basic join
		 String basic = names.stream().collect(Collectors.joining(", "));
		 System.out.println(basic);
		 
		  // With prefix and suffix
		 String withBrackets = names.stream().collect(Collectors.joining(", ","[","]"));
		 System.out.println(withBrackets);
		 
		// Join only names longer than 3 chars
		 String filtered = names.stream().filter(l->l.length()>3).collect(Collectors.joining(" | "," [ "," ] "));
		 System.out.println(filtered);
		 
		 

	}

}
