package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import utilities.PropertiesUtil;
import utilities.Resource;

public class CommonStep {
	
	WebDriver driver;
	
	@Before
	public void getBrowser()
	{
		driver = Resource.initialiseBrowser();
	} 
	
	@Given("^The user is at Homepage$")
	public void the_user_is_at_Homepage() throws IOException
	{
		//go to the site
		String siteUrl = PropertiesUtil.getObject("url");
		driver.get(siteUrl);

		//Assertion
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("My Store", homePageTitle);

	}

}
