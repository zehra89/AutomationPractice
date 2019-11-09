package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TshirtButtonLocator {
	
	WebDriver driver;
	
	public TshirtButtonLocator(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By tShirtButton = By.xpath("(//a[@title='T-shirts'])[2]");
	
	public void click_Tshirt_Button()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(tShirtButton));
		driver.findElement(tShirtButton).click();
	}

}
