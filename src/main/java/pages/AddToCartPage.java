package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Resource;

public class AddToCartPage extends Resource{

	WebDriver driver;
	WebDriverWait wait;
	public By addToCart = By.xpath("//span[contains(.,'Add to cart')]");

	public AddToCartPage (WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);

	}
	
}
