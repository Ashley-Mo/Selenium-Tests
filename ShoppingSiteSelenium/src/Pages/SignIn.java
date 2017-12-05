package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn {

	private WebDriver driver;

	public SignIn(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement signin;
	// locator for signin

	@FindBy(how = How.NAME, using = "email_create")
	public WebElement emailInput;
	// locator for input email

	@FindBy(how = How.NAME, using = "SubmitCreate")
	public WebElement createAccount;
	// locator for click create account

	@FindBy(how = How.ID, using = "email")
	public WebElement email_Login;
	// locator for email login

	@FindBy(how = How.ID, using = "passwd")
	public WebElement pass_Login;
	// locator for password login

	@FindBy(how = How.ID, using = "SubmitLogin")
	public WebElement Submit_Button;
	// locator for Submit_Button for login

	@FindBy(how = How.XPATH, using = ".//*[@id='account-creation_form']/div[1]/div[1]/div[1]/label/div/span/input")
	public WebElement Gender1;
	// locator for Gender Male for login

	// @FindBy(how = How.CLASS_NAME, using = "clearfix")
	// public List<WebElement> radio;

	public void login(String username, String password) {
		signin.click();
		email_Login.sendKeys(username);
		pass_Login.sendKeys(password);
		Submit_Button.click();

	}// method for logging into the account

}
