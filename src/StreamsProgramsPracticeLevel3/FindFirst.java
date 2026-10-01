package StreamsProgramsPracticeLevel3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find the first failed test status.
public class FindFirst {

	public static void main(String[] args) 
	{
		
		List<String> statuses = Arrays.asList("PASS", "PASS", "FAIL", "PASS", "FAIL");
		
		Optional<String> s = statuses.stream().filter(st->st.equals("FAIL")).findFirst();
		System.out.println(s);
	}

}
