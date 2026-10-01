package StreamsProgramsPracticeLevel4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) 
	{
		List<String> browsers = Arrays.asList("Chrome", "Firefox", "Edge", "Safari");
		
		
	    String j = 	browsers.stream().collect(Collectors.joining(" | "));
	    System.out.println(j);
	    
	            /*delimiter = ","
	    		prefix    = "["
	    		suffix    = "]"
	    		*/
	    
	    String b = browsers.stream().collect(Collectors.joining(",","[","]"));
	    System.out.println(b);

	}

}
