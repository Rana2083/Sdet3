package com.vtiger.generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener
{

	public void onTestStart(ITestResult result) {
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+ "oops test got failed");
		try {
			base.takescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) 
		{
		  e.printStackTrace();
		}
		
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
