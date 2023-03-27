package com.bridgelabz.base;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners extends BaseClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart  "+result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage");}

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout");
    }
}
