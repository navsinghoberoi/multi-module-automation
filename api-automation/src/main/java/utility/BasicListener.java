package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BasicListener implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Starting execution of => " + iTestContext.getName() + " testcases");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Finishing execution of => " + iTestContext.getName() + " testcases");
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(getTestMethodName(iTestResult) + " test method execution has started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(getTestMethodName(iTestResult) + " test method has ran successfully");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(getTestMethodName(iTestResult) + " test method has failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println(getTestMethodName(iTestResult) + " test method has been skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
}
