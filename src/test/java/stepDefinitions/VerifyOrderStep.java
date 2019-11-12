package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Resources;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddToCartPage;
import pages.ProceedToCheckOutPage;
import pages.TshirtButtonPage;
import pages.TshirtImagePage;
import utilities.PropertiesUtil;
import utilities.Resource;


public class VerifyOrderStep {

	WebDriver driver;
	WebDriverWait wait;
	Resources resource;
	String cartName;
	String cartPrice;


	@Before
	public void getBrowser()
	{
		driver = Resource.initialiseBrowser();
	} 

	/*@Given("^The user is at Homepage$")
	public void the_user_is_at_Homepage() throws IOException
	{
		//go to the site
		String siteUrl = PropertiesUtil.getObject("url");
		driver.get(siteUrl);

		//Assertion
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("My Store", homePageTitle);

	} */

	@When("^he clicks on the t-shirt menu$")
	public void he_clicks_on_the_t_shirt_menu() 
	{

		//click the shirt button
		TshirtButtonPage tshirtObject = new TshirtButtonPage(driver, wait);
		tshirtObject.click(tshirtObject.tShirtButtonLocator); 

		//Assertion
		String tShirtSection = driver.getTitle();
		Assert.assertEquals("T-shirts - My Store",tShirtSection );



	}

	@When("^he adds a t-shirt to his cart$")
	public void he_adds_a_t_shirt_to_his_cart() throws InterruptedException
	{
		// View the shirt
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");

		TshirtImagePage tshirtImageObject = new TshirtImagePage(driver,wait);
		tshirtImageObject.click(tshirtImageObject.tshirtImage);

		//Assertion
		String myTshirtPage = driver.getTitle();
		Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", myTshirtPage);

		AddToCartPage addToCartObject = new AddToCartPage(driver, wait);
		addToCartObject.click(addToCartObject.addToCart);
		Thread.sleep(1000);

		// The Shirt Values on the Cart
		cartPrice = driver.findElement(By.xpath("//span[@class='ajax_block_products_total']")).getText();
		cartName = driver.findElement(By.xpath("//span[@class='product-name']")).getText();

		//Assertion
		Boolean proceed = driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).isDisplayed();
		Assert.assertTrue(proceed);

	} 

	@Then("^he should see it in the Shopping Summary$")
	public void he_should_see_it_in_the_Shopping_Summary() 
	{

		ProceedToCheckOutPage proceedToCheckOut = new ProceedToCheckOutPage(driver, wait);
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
		driver.quit();
	}  


} 
