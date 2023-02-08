package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	
	//Elements
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="email")
	WebElement txt_emailAddress;
	
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_Login;
	
	//Actions
	
	public void setEmailAddress(String email)
	{
		txt_emailAddress.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_Login.click();
	}

}
