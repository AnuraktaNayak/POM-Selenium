package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	WebDriver driver;

	@FindBy(css = "input[value='coach']")
	@CacheLookup
	private WebElement preference;

	@FindBy(name = "airline")
	@CacheLookup
	private WebElement airlineName;

	@FindBy(name = "findFlight")
	@CacheLookup
	private WebElement submit;

	public FlightFinder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void findFlight() {
	preference.click();
	Select airline=new Select(airlineName);
	airline.selectByIndex(2);
	submit.click();

	}

}
