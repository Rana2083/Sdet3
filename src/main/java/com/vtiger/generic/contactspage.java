package com.vtiger.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactspage 
{
	WebDriver driver;
	
	
    @FindBy(xpath="//img[@title='Create Contact...']")	
	 private WebElement clickcontact;
    
	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement clickaction;
	
    @FindBy(xpath="//a[text()='Contacts']")
    private WebElement contacts;
    
    @FindBy(xpath="//input[@class='txtBox']")
    private WebElement searchforcontacts;
    
    @FindBy(xpath="//input[@name='submit']")
    private WebElement submitbtn;
    
   
    
    @FindBy(xpath="//a[@title='Contacts']")
    private WebElement expectedresult;

	

	public WebElement getClickcontact() {
		return clickcontact;
	}

	

	public WebElement getClickaction() {
		return clickaction;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getSearchforcontacts() {
		return searchforcontacts;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	

	public WebElement getExpectedresult() {
		return expectedresult;
	}

	public contactspage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
