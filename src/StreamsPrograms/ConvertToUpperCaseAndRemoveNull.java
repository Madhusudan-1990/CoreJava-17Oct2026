package StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ConvertToUpperCaseAndRemoveNull {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("alice", null, "bob", null, "carol");
		
		List<String> filterNames = names.stream().filter(n->n!=null).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(filterNames);
		
		// or 
		List<String> result = names.stream()
			    .filter(Objects::nonNull)
			    .map(String::toUpperCase)
			    .collect(Collectors.toList());
		System.out.println(result);
		

	}

}
