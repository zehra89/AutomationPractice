package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TshirtImagePage{

	WebDriver driver;
	WebDriverWait wait;
	public By tshirtImage = By.xpath("//img[contains(@alt,'Faded Short Sleeve T-shirts')]");

	public TshirtImagePage(WebDriver driver, WebDriverWait wait) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
	}

	public void click (By elementLocation) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
		driver.findElement(elementLocation).click();
	}

	/*	public void click_Tshirt_Image()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(tshirtImage));
		driver.findElement(tshirtImage).click();
	} */

}
