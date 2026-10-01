package StreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Given a list of test results containing test name, department, and execution time, 
 * find the test with the lowest execution time in each department and return the result as:
	Map<String, Optional<TestResult>>
 */
class TestResult {
    String testName;
    String department;
    double executionTime;

    TestResult(String testName, String department, double executionTime) {
        this.testName = testName;
        this.department = department;
        this.executionTime = executionTime;
    }

    String getTestName() {
        return testName;
    }

    String getDepartment() {
        return department;
    }

    double getExecutionTime() {
        return executionTime;
    }

    @Override
    public String toString() {
        return "TestResult [testName=" + testName +
               ", department=" + department +
               ", executionTime=" + executionTime + "]";
    }
}
public class LowestExecutionTimeByDepartment {

	public static void main(String[] args) 
	{
		List<TestResult> results = Arrays.asList(
			    new TestResult("Login", "QA", 450.5),
			    new TestResult("Payment", "QA", 320.2),
			    new TestResult("Search", "Dev", 280.5),
			    new TestResult("Checkout", "Dev", 510.3),
			    new TestResult("Logout", "QA", 390.1)
			);
		
	Map<String, Optional<TestResult>> lowestExecutionTime = results.stream().collect(
				Collectors.groupingBy(
						TestResult::getDepartment,
							Collectors.minBy(Comparator.comparingDouble(TestResult::getExecutionTime))));
	
	System.out.println(lowestExecutionTime);
		
		

	}

}
