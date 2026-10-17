package StreamsAssesmentInterviewBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Given a list of test results, 
 * find the number of failed tests in each department 
 * and return a Map<String, Long>.
 */
class TestResult {

    private String testName;
    private String department;
    private String status;

    public TestResult(String testName, String department, String status) {
        this.testName = testName;
        this.department = department;
        this.status = status;
    }

    public String getTestName() {
        return testName;
    }

    public String getDepartment() {
        return department;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "testName='" + testName + '\'' +
                ", department='" + department + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
public class DepartmentFailedTestCount {

	public static void main(String[] args) 
	{
		List<TestResult> results = Arrays.asList(
			    new TestResult("Login", "QA", "PASS"),
			    new TestResult("Payment", "QA", "FAIL"),
			    new TestResult("Search", "QA", "FAIL"),
			    new TestResult("Checkout", "Dev", "FAIL"),
			    new TestResult("Logout", "Dev", "PASS"),
			    new TestResult("Profile", "Dev", "FAIL")
			);
		
		Map<String, Long> res = results.stream().filter(test->test.getStatus().equals("FAIL"))
				.collect(Collectors.groupingBy(TestResult::getDepartment,Collectors.counting()));
		
	System.out.println(res);
	
		

	}

}
