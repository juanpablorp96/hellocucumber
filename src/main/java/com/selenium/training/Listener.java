package com.selenium.training;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("El test pasó");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("El test falló");
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}

