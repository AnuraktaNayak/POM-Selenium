package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	private WebDriver driver;

	@FindBy(name = "userName")
	@CacheLookup
	private WebElement user;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement pass;
	
	@FindBy(name="login")
	@CacheLookup
	private WebElement submit;

	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(){
		user.sendKeys("mercury");
		user.sendKeys("mercury");
		submit.click();
	}
	
}
