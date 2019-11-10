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

import com.google.common.io.Resources;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.AddToCartLocator;
import locators.ProceedToCheckOutLocator;
import locators.TshirtButtonLocator;
import locators.TshirtImageLocator;
import utilities.Resource;


public class VerifyOrderStepDefinition extends Resource {

	WebDriver driver;
	WebDriverWait wait;
	Resources resource;
	String cartName;
	String cartPrice;
	String Url = "http://automationpractice.com/index.php";




	@Before
	public void getBrowser()
	{
		driver = Resource.initialiseBrowser();

	} 

	@Given("^The user is at Homepage$")
	public void the_user_is_at_Homepage()
	{
		//go to the site
		driver.get(Url);
		
		//Assertion
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("My Store", homePageTitle);

	}

	@When("^he clicks on the t-shirt menu$")
	public void he_clicks_on_the_t_shirt_menu() 
	{
		//click the tshirt button
		TshirtButtonLocator tshirtObject = new TshirtButtonLocator(driver,wait);
		tshirtObject.click(tshirtObject.tShirtButtonLocator);
		
		//Assertion
		String tShirtSection = driver.getTitle();
		Assert.assertEquals("T-shirts - My Store",tShirtSection );



	}

	@When("^he adds a t-shirt to his cart$")
	public void he_adds_a_t_shirt_to_his_cart() throws InterruptedException
	{
		// View the tshirt
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		
		TshirtImageLocator tshirtImageObject = new TshirtImageLocator(driver,wait);
		tshirtImageObject.click(tshirtImageObject.tshirtImage);
		
		//Assertion
		String myTshirtPage = driver.getTitle();
		Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", myTshirtPage);

		AddToCartLocator addToCartObject = new AddToCartLocator(driver);
		addToCartObject.click(addToCartObject.addToCart);
		Thread.sleep(1000);
		
		// The Shirt Values on the Cart
		cartPrice = driver.findElement(By.xpath("//span[@class='ajax_block_products_total']")).getText();
		System.out.println(cartPrice);
		cartName = driver.findElement(By.xpath("//span[@class='product-name']")).getText();
		System.out.println(cartName);
        
		//Assertion
		Boolean proceed = driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).isDisplayed();
		Assert.assertTrue(proceed);
		
	} 

	@Then("^he should see it in the Shopping Summary$")
	public void he_should_see_it_in_the_Shopping_Summary() 
	{
		
		ProceedToCheckOutLocator proceedToCheckOut = new ProceedToCheckOutLocator(driver);
		proceedToCheckOut.click(proceedToCheckOut.proceedToCheckOut);
		
		//Assertion
		String summary = driver.getTitle();
		Assert.assertEquals("Order - My Store", summary);
		
		//The Shirt values on the Summary Page
		String summaryName = driver.findElement(By.xpath("(//a[contains(.,'Faded Short Sleeve T-shirts')])[2]")).getText();
		String summaryPrice = driver.findElement(By.xpath("(//span[@class='price'])[3]")).getText();
		
		
		
		//Compare both the shirts
		Assert.assertEquals(cartName, summaryName);
		Assert.assertEquals(cartPrice, summaryPrice);
		
		System.out.println(summaryName);
		System.out.println(summaryPrice);
		

	}  
}
