package testCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{


	@Test(groups = {"Master","Regression","Sanity"})
	public void test_AccountRegistrationTest() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickregister();
		
		
		RegistrationPage regpage = new RegistrationPage(driver);
		
		regpage.setFirstName();
		
		regpage.setLastName();
		
		regpage.setEmail();
		
		regpage.setPassword();
		
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        //Scroll down till the bottom of the page
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    
		regpage.setPrivacyPolicy();

		regpage.clickContinue();
	        
	     
		
		/*String confmsg=regpage.getConfirmationmessage();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");*/
		
		
		
	}

}
