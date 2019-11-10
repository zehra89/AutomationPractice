package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {

	WebDriver driver;
	WebDriverWait wait;
	public By addToCart = By.xpath("//span[contains(.,'Add to cart')]");

	public AddToCartPage (WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);

	}

	public void click (By elementLocation) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
		driver.findElement(elementLocation).click();
	}
	/*public void click_Add_to_Cart()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
		driver.findElement(addToCart).click();
	}*/

}
