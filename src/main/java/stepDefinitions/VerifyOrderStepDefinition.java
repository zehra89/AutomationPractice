package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.AddToCartLocator;
import locators.ProceedToCheckOutLocator;
import locators.TshirtButtonLocator;
import locators.TshirtImageLocator;
import utilities.DriverInIt;


public class VerifyOrderStepDefinition {

	WebDriver driver;
	WebDriverWait wait;
	DriverInIt driverInIt;
	String Url = "http://automationpractice.com/index.php";
	
	

	@Before
	public void getBrowser()
	{
		driver = DriverInIt.initialiseBrowser();
	
	} 

	@Given("^The user is at Homepage$")
	public void the_user_is_at_Homepage()
	{
		driver.get(Url);

	}

	@When("^he clicks on the t-shirt menu$")
	public void he_clicks_on_the_t_shirt_menu() 
	{
		TshirtButtonLocator tshirtObject = new TshirtButtonLocator(driver,wait);
		tshirtObject.click_Tshirt_Button();
		
		
	
	}

	@When("^he adds a t-shirt to his cart$")
	public void he_adds_a_t_shirt_to_his_cart() throws InterruptedException
	{
	
		
		TshirtImageLocator tshirtImageObject = new TshirtImageLocator(driver);
		tshirtImageObject.click_Tshirt_Image();
		
		AddToCartLocator addToCartObject = new AddToCartLocator(driver);
		addToCartObject.click_Add_to_Cart();
		
		
		ProceedToCheckOutLocator proceedToCheckOut = new ProceedToCheckOutLocator(driver);
		proceedToCheckOut.click_Proceed_to_Checkout();
		

	} 

	/*@Then("^he should see it in the Shopping Summary$")
	public void he_should_see_it_in_the_Shopping_Summary() 
	{
		By myShirt = By.linkText("Faded Short Sleeve T-shirts");
		Boolean isPresent = driver.findElement(myShirt).isDisplayed();
		Assert.assertTrue(isPresent);
		

	}  */
}
