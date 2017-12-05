package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import Pages.SignIn;

public class VerifyValidLogin {
	public static WebDriver driver;

	public static void main(String[] args) {

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

		SignIn trial = PageFactory.initElements(driver, SignIn.class);

		trial.signin.click();
		trial.login("lal.aswathy@gmail.com", "pass123");

		System.out.println("Login Successful");

		driver.quit();

	}

}
