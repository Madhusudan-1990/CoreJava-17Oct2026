package StreamsQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class TestResult {
    @Override
	public String toString() {
		return "TestResult [testName=" + testName + ", executionTime=" + executionTime + "]";
	}

	String testName;
    int executionTime;

    TestResult(String testName, int executionTime) {
        this.testName = testName;
        this.executionTime = executionTime;
    }

    public String getTestName() {
        return testName;
    }

    public int getExecutionTime() {
        return executionTime;
    }
}
public class HighestExecutionTimeWithDuplicateElimination {

	public static void main(String[] args) 
	{
		List<TestResult> results = Arrays.asList(
			    new TestResult("LoginTest", 450),
			    new TestResult("PaymentTest", 800),
			    new TestResult("LoginTest", 600),
			    new TestResult("SearchTest", 300)
			);
		
		Map<String, Integer> testResultList = results.stream()
		.collect(Collectors.toMap(TestResult::getTestName, TestResult::getExecutionTime,
				(a,b)->Math.max(a, b)));
	
	System.out.println(testResultList);

	}

}
