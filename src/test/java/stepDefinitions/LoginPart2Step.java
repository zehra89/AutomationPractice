package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPart2Page;
import utilities.Resource;

public class LoginPart2Step {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before 
	public void getBrowser()
	{
		driver = Resource.initialiseBrowser();
	} 

	
	@When("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String arg1, String arg2) throws InterruptedException
	{
		LoginPart2Page login2 = new LoginPart2Page(driver, wait);
		login2.writeText(login2.email, arg1);
		login2.writeText(login2.password, arg2);
		login2.click(login2.signInButton);
		Thread.sleep(1000);
	}
	
	@Then("^He should sign in to the system$")
	public void he_should_sign_in_to_the_system()
	{
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "My account - My Store");
		System.out.println(title);
	}


}
