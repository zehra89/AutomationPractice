package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Resource;


public class TshirtButtonLocator extends Resource{

	WebDriver driver;
	WebDriverWait wait;
	public By tShirtButtonLocator = By.xpath("(//a[@title='T-shirts'])[2]");
	
	
	public TshirtButtonLocator(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);
	}

	public void click(By elementLocator)
	{
		driver.findElement(elementLocator).click();
	}

	/*public void click_Tshirt_Button()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(tShirtButton));
		driver.findElement(tShirtButton).click();
	}  */

}