package Test2Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentTestStatusCount {

	public static void main(String[] args) 
	{
		List<TestResult> results = Arrays.asList(
			    new TestResult("LoginTest", "CRM", "PASS"),
			    new TestResult("SearchTest", "CRM", "FAIL"),
			    new TestResult("CreateOrderTest", "ECOM", "FAIL"),
			    new TestResult("PaymentTest", "ECOM", "PASS"),
			    new TestResult("LogoutTest", "CRM", "FAIL"),
			    new TestResult("CancelOrderTest", "ECOM", "FAIL"),
			    new TestResult("UpdateProfileTest", "CRM", "PASS")
			);
		
		
		 Map<String, Map<String, Long>> count = results.stream()
			.collect(Collectors
					.groupingBy(TestResult::getDepartment,
							Collectors.groupingBy(TestResult::getStatus,Collectors.counting())));
		
		System.out.println(count);

	}

}
