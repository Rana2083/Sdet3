package com.vtiger.organization;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.generic.ExcelUtil;
import com.vtiger.generic.FileUtil;
import com.vtiger.generic.JavaUtil;
import com.vtiger.generic.base;
import com.vtiger.generic.createorganzationPage;
import com.vtiger.generic.homePage;
import com.vtiger.generic.loginPage;
import com.vtiger.generic.organizationcreate;

import com.vtiger.generic.webdriverUtil;

public class Tc002_Createorganizationbydropdown_Test extends base {

 @Test(groups="RegressionTest")
	public void  createOrgdropdown() throws IOException, InterruptedException
	{
//		// Launch the Browser 
//		String Browser=FileUtil.objectoffileutil().readdatafrompropfile("browser");
//		if(Browser.equalsIgnoreCase("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else if(Browser.equalsIgnoreCase("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		else
//		{
//			driver=new ChromeDriver();
//		}
//		String url=FileUtil.objectoffileutil().readdatafrompropfile("url");
//		driver.get(url);
//		webdriverUtil webdriver=new webdriverUtil(driver);
//		webdriver.maximizewindow();
//		webdriver.pageloadtimeout(10);
		
		
		homePage hp=new homePage(driver);
		organizationcreate og=new organizationcreate(driver);
		createorganzationPage ogc=new createorganzationPage(driver);


		hp.getOrgname().click();

		og.getCreateorganization().click();
		String orgname=JavaUtil.ObjForJavaUtil().getfullname();
		ogc.getGivename().sendKeys(orgname);
	
        ogc.dropdown1("sheet1", 0, "Consulting");
		
		ogc.dropdown2("sheet1", 1, "Competitor");
		
		ogc.dropdown3("sheet1", 2, "Market Failed");
		
		ogc.getSave().click();
		
		driver.navigate().refresh();
		
		hp.getOrgname().click();
		
		og.getSearchtext().sendKeys(orgname);
		og.dropdown();
		og.getSubmit().click();
		og.getExpected().isEnabled();
		Thread.sleep(2000);
		String expected=og.getExpected().getText();
		System.out.println(expected);
//		if(expected.equalsIgnoreCase(orgname))
//		{ 
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		assertEquals(expected,orgname);
	}

}


//Enter login Details
//String admin=FileUtil.objectoffileutil().readdatafrompropfile("username");
//driver.findElement(By.name("user_name")).sendKeys(admin);
//
//String pass=FileUtil.objectoffileutil().readdatafrompropfile("Password");
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
//driver.findElement(By.id("submitButton")).click();

//driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(organization);

//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//Enter the Details created account
//driver.findElement(By.xpath("//a[text()='Organizations']")).click();

		//driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(organization);
//verify the details
//System.out.println(driver.findElement(By.xpath("//a[@title='Organizations']")).getText());
//String expected=driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
//sign out
//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

//handling dropdown of organization
//WebElement dropdown=driver.findElement(By.id("bas_searchfield"));
//webdriver.selectvaluefromdd(dropdown, 1);
//
//driver.findElement(By.xpath("//input[@name='submit']")).click();
//String drop=ExcelUtil.objectexcelUtil().selectvaluefordd("sheet1", 0, "Electronics");
//WebElement dd1=driver.findElement(By.name("industry"));
//webdriver.selectvaluefromdd(dd1, drop);

//String drop1=ExcelUtil.objectexcelUtil().selectvaluefordd("sheet1", 1, "Customer");
//WebElement dd2=driver.findElement(By.name("accounttype"));
//webdriver.selectvaluefromdd(dd2, drop1);

//String drop3=ExcelUtil.objectexcelUtil().selectvaluefordd("sheet1", 2, "Acquired");
//WebElement dd3=driver.findElement(By.name("rating"));
//webdriver.selectvaluefromdd(dd3, drop3);
