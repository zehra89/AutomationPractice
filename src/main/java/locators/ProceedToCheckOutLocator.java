package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProceedToCheckOutLocator {
WebDriver driver;
	
	public ProceedToCheckOutLocator (WebDriver driver)
	{
		this.driver = driver;
		
	}

	By proceedToCheckOut = By.xpath("//span[contains(.,'Proceed to checkout')]");
	
	public void click_Proceed_to_Checkout()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut));
		driver.findElement(proceedToCheckOut).click();
	}

}
