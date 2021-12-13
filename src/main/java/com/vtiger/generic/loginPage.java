package com.vtiger.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	WebDriver driver;
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password1;
	
	@FindBy(id="submitButton")
	private WebElement submitbtn;

	public WebElement getUsername()
	{
		return username;
	}

	public WebElement getPassword1()
	{
		return password1;
	}

	public WebElement getSubmitbutton()
	{
		return submitbtn;
	}
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginintoApp() throws IOException
	{
		username.sendKeys(FileUtil.objectoffileutil().readdatafrompropfile("username"));
		password1.sendKeys(FileUtil.objectoffileutil().readdatafrompropfile("Password"));
		submitbtn.click();
	}
	
	public void loginintoApp(String userloginname,String password)
	{
	    username.sendKeys(userloginname);
		password1.sendKeys(password);
		submitbtn.click();
	}

}
