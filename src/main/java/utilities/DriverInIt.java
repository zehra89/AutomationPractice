package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInIt {

	
	public static WebDriver driver;
	public static String projectPath = null;
	public static WebDriverWait wait;
	
	public static WebDriver initialiseBrowser()
	{
		if (driver == null)
		{
			projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath+"/driver/geckodriver/geckodriver");
			driver = new FirefoxDriver();

			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 20);
		}
		return driver;
	} 

	//Basic Actions

	public void click (By elementLocation) {
		driver.findElement(elementLocation).click();
	}


	public void writeText (By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}


	public String readText (By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}

	

	
}




