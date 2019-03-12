package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	//whenever any test case finished executing, this method is called
	public void onFinish(ITestContext Result){
		
		System.out.println("The name of the finished test case is :"+Result.getName());
	}

	//whenever any test case started executing, this method is called
	public void onStart(ITestContext Result) {
		
		System.out.println("The name of the started test case is :"+Result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	//whenever test case fails, this method is called
	public void onTestFailure(ITestResult Result) {
		
		System.out.println("The name of the failed testcase is :"+ Result.getName());
		
	}

	//whenever test case gets skipped, this method is called
	public void onTestSkipped(ITestResult Result) {
		
		System.out.println("The name of the skipped testcase is :"+Result.getName());
		
	}

	//whenever test case gets started, this method is called
	public void onTestStart(ITestResult Result) {
		
		System.out.println("The name of the started testcase is :"+Result.getName());
		
	}

	//whenever test case gets passed, this method is called
	public void onTestSuccess(ITestResult Result) {
		
		System.out.println("The name of the passed testcase is :"+Result.getName());
		
	}
	
}
