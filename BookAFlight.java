package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	WebDriver driver;
	
	@FindBy(name="passFirst0")
	@CacheLookup
	private WebElement name;
	
	@FindBy(name="passLast0")
	@CacheLookup
	private WebElement last;
	
	@FindBy(name="creditnumber")
	@CacheLookup
	private WebElement card;
	
	@FindBy(name="buyFlights")
	@CacheLookup
	private WebElement submit;
	
	public BookAFlight(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flightBooking(String fname, String flast, String cc){
		name.sendKeys(fname);
		last.sendKeys(flast);
		card.sendKeys(cc);
		submit.click();
	}
	

}
