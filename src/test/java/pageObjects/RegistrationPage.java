package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elements
	
	@FindBy(name="firstname")
	WebElement txtFirstName;
	
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(name = "agree")
	WebElement chkdPolicy;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnContinue;
	
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	
	//Actions
	
	public void setFirstName()
	{
		txtFirstName.sendKeys("Pr");
	}
	
	public void setLastName()
	{
		txtLastName.sendKeys("T");
	}
	
	public void setEmail()
	{
		txtEmail.sendKeys("abctext@gmail.com");
	}
	
	public void setPassword()
	{
		txtPassword.sendKeys("test@123");
	}
	
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public String getConfirmationmessage() {
		
		try {
		return (msgConfirmation.getText());
		}catch(Exception e)
		{
			return (e.getMessage());
		}
		
		
	}
	
}
