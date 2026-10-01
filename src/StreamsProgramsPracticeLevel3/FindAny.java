package StreamsProgramsPracticeLevel3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {

	public static void main(String[] args) 
	{
		List<String> statuses = Arrays.asList("PASS", "FAIL", "PASS", "FAIL");
		Optional<String> anyStatus = statuses.stream().filter(st->st.equals("FAIL")).findAny();
		System.out.println(anyStatus);

	}

}
