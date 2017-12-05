package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TitleCheck {

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

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("My Store")) {
			System.out.println("Title matches");
		} else {
			System.out.println("Title mismatch");
		}
		driver.quit();
	}

}
