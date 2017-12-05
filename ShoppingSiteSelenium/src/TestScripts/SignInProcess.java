package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import Pages.SignIn;

public class SignInProcess {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette", "C:/Users/serajendran/Downloads/geckodriver-0.10.0 (1)");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		// Set the Capabilities

		driver = new FirefoxDriver(capabilities);
		// Create an instance of web driver

		// driver = new FirefoxDriver();

		driver.get("http://automationpractice.com/index.php");
		// Navigate to web page

		driver.manage().window().maximize();
		// maximize the window

		SignIn trialSign = PageFactory.initElements(driver, SignIn.class);

		trialSign.signin.click();
		// click sign-in

		trialSign.emailInput.sendKeys("toashal86@gmail.com");
		// enter email to create account

		trialSign.createAccount.click();

		trialSign.Gender1.click();

		driver.quit();

	}

}
