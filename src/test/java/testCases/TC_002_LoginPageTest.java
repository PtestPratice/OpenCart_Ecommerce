package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginPageTest extends BaseClass {
	
	
	@Test(groups= {"Sanity"})
	public void LoginPage()
	{
		try {
		logger.debug("Application Logs...........");
		logger.info("*** Starting TC_002_LoginPageTest ***");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		
		logger.info("Clicked on MyAccount link");

		
		hp.clickLogin();
		
		logger.info("Clicked on Login link");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmailAddress(rb.getString("txt_emailAddress"));
		logger.info("Provided Login details");

		lp.setPassword(rb.getString("txt_password"));
		lp.clickLogin();
		
		/*MyAccountPage map = new MyAccountPage(driver);
		
		boolean msgHeading = map.isMyAccountPageExists();
		
		Assert.assertEquals(msgHeading, "true");*/
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*** Completed TC_002_LoginPageTest ***");


	}

}
