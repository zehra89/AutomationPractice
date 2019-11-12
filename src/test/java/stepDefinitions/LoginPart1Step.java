package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPart1Page;
import pages.LoginPart2Page;
import utilities.PropertiesUtil;
import utilities.Resource;

public class LoginPart1Step {

	WebDriver driver;
	WebDriverWait wait;

	@Before 
	public void getBrowser()
	{
		driver = Resource.initialiseBrowser();
	} 


	@When("^He clicks on the signin button$")
	public void he_clicks_on_the_signin_button() throws InterruptedException
	{
		LoginPart1Page login1 = new LoginPart1Page(driver,wait);
		login1.click(login1.signIn);
		
		
		//Assertion 
		LoginPart2Page login2 = new LoginPart2Page(driver,wait);
		Boolean a = driver.findElement(login2.email).isDisplayed();
		Assert.assertTrue(a);
	
	}
	
} 
