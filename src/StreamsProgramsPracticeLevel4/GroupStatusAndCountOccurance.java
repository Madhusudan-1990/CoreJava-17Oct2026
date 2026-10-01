package StreamsProgramsPracticeLevel4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Group the statuses and count how many times each status occurs.
public class GroupStatusAndCountOccurance {

	public static void main(String[] args) 
	{
		List<String> statuses =Arrays.asList(
			        "PASS", "FAIL", "PASS",
			        "SKIP", "FAIL", "PASS"
			    );
		
	 Map<String, Long> groupByStatus = statuses.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	 System.out.println(groupByStatus);

	}

}
