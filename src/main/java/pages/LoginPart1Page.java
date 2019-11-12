package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Resource;

public class LoginPart1Page extends Resource {
	
	WebDriver driver;
	WebDriverWait wait;
	public By signIn = By.xpath("//a[@class='login']");


	public LoginPart1Page (WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);

	}
	
	

}
