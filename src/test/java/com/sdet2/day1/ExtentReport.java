package com.sdet2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport
{
	ExtentSparkReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeMethod
	public void facebook()
	{
		String file=System.getProperty("user.dir")+"\\test-output\\index2.html";
		reporter=new ExtentSparkReporter(file);
		reporter.config().setReportName("facebook Test Report");
		reporter.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Testengineer", "Rana");		
	}
	
	@Test
	public void intialdemo()
	{
		test=extent.createTest("intialdemo");
		WebDriver driver=new ChromeDriver();	
	    driver.get("https://www.facebook.com");
	    Assert.assertEquals(false, false);
	    
	}
	@Test
	public void intialdemo1()
	{
		test=extent.createTest("intialdemo1");
		WebDriver driver=new ChromeDriver();	
	    driver.get("https://www.facebook.com");
	    Assert.assertEquals(true, false);
	   
	}
	@AfterMethod
	public void facebook2()
	{
		 extent.flush();
	}

}
