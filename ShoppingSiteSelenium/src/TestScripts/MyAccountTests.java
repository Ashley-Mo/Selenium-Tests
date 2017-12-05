package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import Pages.MyaccountPage;
import Pages.SignIn;

public class MyAccountTests {
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

		SignIn trial = PageFactory.initElements(driver, SignIn.class);

		trial.login("lal.aswathy@gmail.com", "pass123");

		MyaccountPage acc = PageFactory.initElements(driver, MyaccountPage.class);
		acc.MySearch.sendKeys("Shirt");
		acc.Search_Button.click();

	}

}
