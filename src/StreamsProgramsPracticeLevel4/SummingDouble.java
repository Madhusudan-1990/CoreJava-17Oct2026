package StreamsProgramsPracticeLevel4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TestResult {
    public TestResult(String testName, double executionTime) 
    {
		this.testName = testName;
		this.executionTime = executionTime;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public double getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(double executionTime) {
		this.executionTime = executionTime;
	}
	String testName;
    double executionTime;
}
public class SummingDouble {

	public static void main(String[] args) 
	{
		
		
		List<TestResult> executionTimes = Arrays.asList(new TestResult("Login", 120.0),
														new TestResult("CreateAccount", 320.0),
														new TestResult("MyAccount", 220.0),
														new TestResult("Logout", 120.0));
	double summingExecutionTimes = executionTimes.stream().collect(Collectors.summingDouble(TestResult::getExecutionTime));
	System.out.println(summingExecutionTimes);

	}

}
