package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Resource;

public class MyPersonalInformationPage extends Resource{

	WebDriver driver;
	WebDriverWait wait;
	public By personalInformation = By.xpath("//span[contains(.,'My personal information')]");


	public MyPersonalInformationPage (WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,20);

	}
	
}
