package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartLocator {
WebDriver driver;
	
	public AddToCartLocator (WebDriver driver)
	{
		this.driver = driver;
		
	}

	By addToCart = By.xpath("//span[contains(.,'Add to cart')]");
	
	public void click_Add_to_Cart()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
		driver.findElement(addToCart).click();
	}

}
