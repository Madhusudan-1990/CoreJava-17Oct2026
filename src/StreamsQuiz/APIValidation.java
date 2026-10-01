package StreamsQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Determine whether any response took more than 500 ms.
public class APIValidation {

	public static void main(String[] args) 
	{
		List<Integer> responseTimes = Arrays.asList(120, 250, 480, 510, 300);
		
		Optional<Integer> res =responseTimes.stream().filter(response->response>500).findAny();
		System.out.println(res);

	}

}
