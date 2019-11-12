package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Resource;


public class TshirtImagePage extends Resource{

	WebDriver driver;
	WebDriverWait wait;
	public By tshirtImage = By.xpath("//img[contains(@alt,'Faded Short Sleeve T-shirts')]");

	public TshirtImagePage(WebDriver driver, WebDriverWait wait) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
	}



}
