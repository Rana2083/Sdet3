package com.vtiger.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class base 
{
	public WebDriver driver;
	loginPage lg;
	homePage hp;
	public static WebDriver sdriver;
	@BeforeSuite
	public void dbconnection()
	{
		System.out.println("Data Base conection");
	}
	
	//@Parameters("browser")
	@BeforeClass(groups = {"SmokeTesting","RegressionTesting"})
	public void browser() throws IOException
	{
	String Browser=FileUtil.objectoffileutil().readdatafrompropfile("browser");
	if(Browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(Browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		driver=new ChromeDriver();
	}
	driver.get(FileUtil.objectoffileutil().readdatafrompropfile("url"));
	webdriverUtil webdriver=new webdriverUtil(driver);
	webdriver.maximizewindow();
	webdriver.pageloadtimeout(10);

    }
	
	@BeforeMethod(groups = {"SmokeTesting","RegressionTesting"})
	public void login() throws IOException
	{
		lg=new loginPage(driver);
		
		lg.loginintoApp();
		sdriver=driver;
	}
	
	

	@AfterMethod(groups = {"SmokeTesting","RegressionTesting"})
    public void signout()
	{
		hp=new homePage(driver);
		hp.signoutfromhp();
	}
	@AfterClass
	public void quit()
	{
		driver.close();
	}
	@AfterSuite
	public void dbclose()
	{
		System.out.println("disconnect from database");
	}
	
	public static void takescreenshot(String name) throws IOException
	{
		File srcfile=((TakesScreenshot)sdriver).getScreenshotAs(OutputType.FILE);
		File destfile=new File(System.getProperty("user.dir")+"/screenshots/"+name+".png");
		FileUtils.copyFile(srcfile, destfile);
	}
	
}
