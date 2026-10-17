package Test2Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class TestResult {
    public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	String testName;
    String department;
    String status;

    public TestResult(String testName, String department, String status) {
        this.testName = testName;
        this.department = department;
        this.status = status;
    }
}
public class DepartmentFailedTestCount {

	public static void main(String[] args) 
	{
		List<TestResult> results = Arrays.asList(
			    new TestResult("LoginTest", "CRM", "PASS"),
			    new TestResult("SearchTest", "CRM", "FAIL"),
			    new TestResult("CreateOrderTest", "ECOM", "FAIL"),
			    new TestResult("PaymentTest", "ECOM", "PASS"),
			    new TestResult("LogoutTest", "CRM", "FAIL"),
			    new TestResult("CancelOrderTest", "ECOM", "FAIL")
			);
		
			   
		Map<String, Long> resultCount = results.stream().filter(result->result.getStatus().equals("FAIL"))
		.collect(Collectors.groupingBy(TestResult::getDepartment,Collectors.counting()));
		
		System.out.println(resultCount);
	 
	 
		

	}

}
