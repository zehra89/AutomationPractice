package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TshirtButtonPage{

	WebDriver driver;
	WebDriverWait wait;
	public By tShirtButtonLocator = By.xpath("(//a[@title='T-shirts'])[2]");


	public TshirtButtonPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);
	}


	public void click(By elementLocation) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
		driver.findElement(elementLocation).click();
	} 

}