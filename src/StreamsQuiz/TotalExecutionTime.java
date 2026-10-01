package StreamsQuiz;

import java.util.Arrays;
import java.util.List;

public class TotalExecutionTime {

	//Calculate the total using Streams.
	public static void main(String[] args) 
	{
		List<Integer> executionTimes = Arrays.asList(100, 200, 150, 50);
		Integer sumexecutionTimes = executionTimes.stream().reduce(0,(a,b)->a+b);
		System.out.println(sumexecutionTimes);

	}

}
