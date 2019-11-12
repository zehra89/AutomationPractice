package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import junit.framework.Assert;
import pages.MyPersonalInformationPage;
import utilities.Resource;

public class MyPersonalInformationStep {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before 
	public void getBrowser()
	{
		driver = Resource.initialiseBrowser();
	} 

	
	@Given("^When a user is on My account page$")
	public void when_a_user_is_on_My_account_page()
	{
		MyPersonalInformationPage personalInformation = new MyPersonalInformationPage(driver, wait);
		personalInformation.click(personalInformation.personalInformation);
		
		//Assertion
		String title = driver.getTitle();
		Assert.assertEquals(title, "Identity - My Store");
		System.out.println(title);
	}

}
