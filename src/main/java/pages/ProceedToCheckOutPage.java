package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Resource;

public class ProceedToCheckOutPage extends Resource {

	WebDriver driver;
	WebDriverWait wait;
	public By proceedToCheckOut = By.xpath("//span[contains(.,'Proceed to checkout')]");


	public ProceedToCheckOutPage (WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);

	}



}
