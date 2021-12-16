package com.vtiger.organization;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generic.FileUtil;
import com.vtiger.generic.JavaUtil;
import com.vtiger.generic.base;
import com.vtiger.generic.createorganzationPage;
import com.vtiger.generic.homePage;
import com.vtiger.generic.loginPage;
import com.vtiger.generic.organizationcreate;
import com.vtiger.generic.webdriverUtil;

@Listeners(com.vtiger.generic.listeners.class)
public class Tc001_Createorganisation_Test extends base
{

	@Test(groups="RegressionTest")
	public void openbrowser() throws IOException, InterruptedException {
		homePage hp=new homePage(driver);
		createorganzationPage cop=new createorganzationPage(driver);
		organizationcreate og=new organizationcreate(driver);

		hp.getOrgname().click();
		og.getCreateorganization().click();
		String name =JavaUtil.ObjForJavaUtil().getfirstname()+JavaUtil.ObjForJavaUtil().generaterandomnumber();
		cop.getGivename().sendKeys(name);
		cop.getSave().click();

		driver.navigate().refresh();

		hp.getOrgname().click();

		og.getSearchtext().sendKeys(name);

		og.dropdown();
		og.getSubmit().click();
		Thread.sleep(500);
		cop.getCompare().isEnabled();
		Thread.sleep(20000);
		String expected=og.getExpected().getText();
		
//		if(expected.equalsIgnorecase(name))
//        { 
//			System.out.println("Pass");
//		}		
//		else
//		{			
//			System.out.println("fail");
//     	}
		Assert.assertEquals(name, expected);

	}
@Test(groups="SmokeTesting")
public void createOrganphone() throws InterruptedException
{
	homePage hp=new homePage(driver);
	createorganzationPage cop=new createorganzationPage(driver);
	organizationcreate og=new organizationcreate(driver);

	hp.getOrgname().click();
	og.getCreateorganization().click();
	String name =JavaUtil.ObjForJavaUtil().getfirstname()+JavaUtil.ObjForJavaUtil().generaterandomnumber();
	cop.getGivename().sendKeys(name);

	 int phone=JavaUtil.ObjForJavaUtil().generaterandomphonenumber();
	 String sphone=String.valueOf(phone);
	 cop.getPhonenumber().sendKeys(sphone);

	cop.getSave().click();

	driver.navigate().refresh();

	hp.getOrgname().click();
	og.getSearchtext().sendKeys(sphone);

	og.dropdown1();
	og.getSubmit().click();
	Thread.sleep(500);
	og.getExpected().isEnabled();
	Thread.sleep(2000);
    String expected=og.getExpected().getText();
	
//    if(expected.equalsIgnoreCase(sphone))
//	{ 
//		System.out.println("Pass");
//	}		
//	
//    else
//	{			
//		System.out.println("fail");
//	}
    Assert.assertEquals(expected,name);

}
}


