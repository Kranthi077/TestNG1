package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Clear cookies");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case successfully exected - ITest Listener");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed Takes ScreenShot :-" + result.getName());
		System.out.println("Record the error " + result.getThrowable());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
