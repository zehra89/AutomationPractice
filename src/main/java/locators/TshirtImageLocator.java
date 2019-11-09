package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TshirtImageLocator {
	
	WebDriver driver;
	
	public TshirtImageLocator (WebDriver driver)
	{
		this.driver = driver;
		
	}

	By tshirtImage = By.xpath("//img[contains(@alt,'Faded Short Sleeve T-shirts')]");
	
	public void click_Tshirt_Image()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(tshirtImage));
		driver.findElement(tshirtImage).click();
	}
			
}
