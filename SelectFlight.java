package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	WebDriver driver;

	@FindBy(xpath = "(//input[contains(@value,'Skies')])[2]")
	@CacheLookup
	private WebElement depart;

	@FindBy(xpath = "(//input[contains(@value,'Pangea')])[2]")
	@CacheLookup
	private WebElement arrive;

	@FindBy(name = "reserveFlights")
	@CacheLookup
	private WebElement submit;

	public SelectFlight(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void flightSelection() {
		depart.click();
		arrive.click();
		submit.click();
	}

}
