package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Resource;

public class UpdateFirstNamePage extends Resource {
	
	WebDriver driver;
	WebDriverWait wait;
	public By firstName = By.xpath("//input[@id='firstname']");
	public By password = By.xpath("//input[@id='old_passwd']");
	public By save = By.xpath("//span[contains(.,'Save')]");
	

	public UpdateFirstNamePage(WebDriver driver, WebDriverWait wait) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
	}

}
