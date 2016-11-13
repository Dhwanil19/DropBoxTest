package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import framework.Config;

public class LoginPage   {

	// ------------------------------ FIELDS ------------------------------


	@FindBy(xpath = "//input[@name='login_email']")
	WebElement email;

	@FindBy(id = "sign-in")
	WebElement signIn;

	@FindBy(xpath = "//input[@name='login_password']")
	WebElement password;

	@FindBy(xpath = "//div[@id='regular-login-forms']/div/form/div[3]/button")
	WebElement submit;

	WebDriver driver;


	// --------------------------- CONSTRUCTORS ---------------------------

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// -------------------------- OTHER METHODS --------------------------

	public void open() {
		driver.get(Config.LOGIN_URL);
	}

	public void openSignInModal() throws Exception{
		signIn.click();
	}

	public void fillEmail(String email) {
		
		this.email.sendKeys(email);
	}

	public void fillPassword(String password) {
		this.password.sendKeys(password);
	}

	public void submit() {
		submit.click();

	}

}
