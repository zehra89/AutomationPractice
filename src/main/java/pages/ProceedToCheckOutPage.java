package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProceedToCheckOutPage {

	WebDriver driver;
	WebDriverWait wait;
	public By proceedToCheckOut = By.xpath("//span[contains(.,'Proceed to checkout')]");


	public ProceedToCheckOutPage (WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);

	}

	public void click (By elementLocation) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
		driver.findElement(elementLocation).click();
	}

	/* public void click_Proceed_to_Checkout()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut));
		driver.findElement(proceedToCheckOut).click();
	} */
}
