package com.vtiger.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage 
{
	WebDriver driver;
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgname;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contact;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
	
	public WebElement getSignout() {
		return signout;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getLogoutimg() {
		return logoutimg;
	}
	

	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signoutfromhp()
	{
		logoutimg.click();
		signout.click();
	}
	
	
	
	




}
