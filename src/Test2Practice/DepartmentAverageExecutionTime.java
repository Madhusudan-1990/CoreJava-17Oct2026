package Test2Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ApiTestResult {
    String testName;
    String department;
    long executionTime;

    public ApiTestResult(String testName, String department, long executionTime) {
        this.testName = testName;
        this.department = department;
        this.executionTime = executionTime;
    }

    public String getDepartment() {
        return department;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}
public class DepartmentAverageExecutionTime {

	public static void main(String[] args) 
	{
		List<ApiTestResult> results = Arrays.asList(
			    new ApiTestResult("GetUserTest", "USER", 200),
			    new ApiTestResult("CreateUserTest", "USER", 400),
			    new ApiTestResult("UpdateUserTest", "USER", 300),
			    new ApiTestResult("GetOrderTest", "ORDER", 500),
			    new ApiTestResult("CreateOrderTest", "ORDER", 700),
			    new ApiTestResult("CancelOrderTest", "ORDER", 600)
			);
		
		
	Map<String, Double> avg = results.stream()
			.collect(Collectors
					.groupingBy(ApiTestResult::getDepartment,Collectors.averagingDouble(ApiTestResult::getExecutionTime)));
	
	System.out.println(avg);

	}

}
