package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.UpdateFirstNamePage;
import utilities.Resource;

public class UpdateFirstNameStep {
	WebDriver driver;
	WebDriverWait wait;
	UpdateFirstNamePage updateName;

	@Before 
	public void getBrowser()
	{
		driver = Resource.initialiseBrowser();
		updateName = new UpdateFirstNamePage(driver, wait);

	} 


	@When("^He changes his First Name$")
	public void he_changes_his_First_Name()
	{
		updateName.clear(updateName.firstName);
		updateName.writeText(updateName.firstName, "Zehra");	
	}


	@When("^Provides the \"([^\"]*)\"$")
	public void provides_the(String arg1)
	{
		updateName.writeText(updateName.password, arg1);
		updateName.click(updateName.save);
	}



	@Then("^An updated name should get displayed$")
	public void an_updated_name_should_get_displayed()
	{
		String nameDisplayed = driver.findElement(By.xpath("//a[@class='account']")).getText();
		Assert.assertEquals("Zehra Xyz", nameDisplayed );
		System.out.println(nameDisplayed);
	}


}
