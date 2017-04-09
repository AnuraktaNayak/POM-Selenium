package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.pages.BookAFlight;
import com.demoaut.newtours.pages.FlightFinder;
import com.demoaut.newtours.pages.Login;
import com.demoaut.newtours.pages.SelectFlight;

public class BookTicketTest {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
	}

	@Test
	public void testApp() {
		Login obj1 = new Login(driver);
		FlightFinder obj2 = new FlightFinder(driver);
		SelectFlight obj3 = new SelectFlight(driver);
		BookAFlight obj4 = new BookAFlight(driver);

		obj1.login();
		obj2.findFlight();
		obj3.flightSelection();
		obj4.flightBooking("Anu", "Behera", "1245");

		String expectedTitle = "Your itinerary has been booked";
		String actualTitle = driver
				.findElement(
						By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]"))
				.getText();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@AfterTest
	public void closeTest() {
		driver.quit();
	}

}
