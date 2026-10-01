package StreamsQuiz;

import java.util.Arrays;
import java.util.List;

public class FindAllTestCasePass {

	//Verify that all test cases passed.
	public static void main(String[] args) 
	{
		List<String> statuses = Arrays.asList("PASS", "PASS", "PASS", "PASS");
		boolean status = statuses.stream().allMatch(st->st.equals("PASS"));
		System.out.println(status);

	}

}
