package StreamsProgramsPracticeLevel3;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

	public static void main(String[] args) 
	{
		List<String> statuses = Arrays.asList("PASS", "PASS", "PASS", "PASS");
		
		boolean statusTest = statuses.stream().noneMatch(status->status.contains("FAIL"));
		System.out.println(statusTest);

	}

}
