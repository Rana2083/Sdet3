package com.vtiger.organization;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.generic.FileUtil;
import com.vtiger.generic.JavaUtil;
import com.vtiger.generic.base;
import com.vtiger.generic.contactspage;
import com.vtiger.generic.createcontactspage;
import com.vtiger.generic.createorganzationPage;
import com.vtiger.generic.homePage;
import com.vtiger.generic.loginPage;
import com.vtiger.generic.organizationcreate;
import com.vtiger.generic.webdriverUtil;

public class Tc003_CreateContactusingOrganizationName_Test extends base{

@Test(groups="RegressionTest")
	public void createorganzizationwithcontact() throws InterruptedException, IOException
	{
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
//
//		loginPage lg=new loginPage(driver);
		homePage hp=new homePage(driver);
		createcontactspage ccp=new createcontactspage(driver);
		createorganzationPage ogc=new createorganzationPage(driver);


		contactspage cp=new contactspage(driver);
		organizationcreate og=new organizationcreate(driver);
		webdriverUtil webdriver=new webdriverUtil(driver);
		hp.getContact().click();
        
		cp.getClickcontact().click();
        ccp.contactsdd(3);

		String contname1=JavaUtil.ObjForJavaUtil().getfirstname();
        ccp.getFname().sendKeys(contname1);
		String contname2 =JavaUtil.ObjForJavaUtil().getlastname();
		ccp.getLname().sendKeys(contname2);
        ccp.getSearch().click();
		
		String parent=driver.getWindowHandle();
		webdriver.SwitchToWindowHandles("Adminstrator"); 

		ccp.getEnterorgname().sendKeys("leo");
        ccp.getSearchbtn().click();
        cp.getClickaction().click();

		driver.switchTo().window(parent);
        ogc.getSave().click();
		driver.navigate().refresh();

		cp.getContacts().click();


		cp.getSearchforcontacts().sendKeys(contname1);
        ccp.contactsdd2(1);
        cp.getSubmitbtn().click();
		Thread.sleep(10000);
		cp.getExpectedresult().isEnabled();
		String expected=cp.getExpectedresult().getText();
		System.out.println(expected);
//        if(expected.equalsIgnoreCase(contname1))
//		{ 
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
        assertEquals(expected,contname1);
	}
}

//Enter login Details
//String admin=FileUtil.objectoffileutil().readdatafrompropfile("username");//admi=admin
//driver.findElement(By.name("user_name")).sendKeys(admin);
//String pass=FileUtil.objectoffileutil().readdatafrompropfile("Password");
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
//driver.findElement(By.id("submitButton")).click();

//click on contacts
//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//create a new contact
//driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
//creation of account
//WebElement drop=driver.findElement(By.xpath("//select[@name='salutationtype']"));
//webdriver.selectvaluefromdd(drop, 4);
//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(organization);
//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(organization1);
//	driver.findElement(By.xpath("//img[@title='Select']")).click();
//Enter the details in the child details

//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Leo");
//driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
//come out  from the child browser

//Save the details of contacts 
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//verify organization created
//driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(organization);
//WebElement dropdown=driver.findElement(By.id("bas_searchfield"));
//webdriver.selectvaluefromdd(dropdown, 1);

//validation/check
//System.out.println(driver.findElement(By.xpath("//a[@title='Contacts']")).getText());
//driver.findElement(By.xpath("//a[@title='Contacts']")).getText();
//signout
//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
