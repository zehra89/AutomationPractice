package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Resource;

public class LoginPart2Page extends Resource {

	WebDriver driver;
	WebDriverWait wait;
	public By email = By.xpath("//input[@id='email']");
	public By password = By.xpath("//input[@id='passwd']");
	public By signInButton = By.xpath("//span[contains(.,'Sign in')]");

	public LoginPart2Page (WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);

	}
}
