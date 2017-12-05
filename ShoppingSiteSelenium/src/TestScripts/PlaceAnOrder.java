package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.HomePage;
import Pages.SignIn;
import Pages.Women;

public class PlaceAnOrder {
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

		// signin in to your account
		SignIn trial = PageFactory.initElements(driver, SignIn.class);
		trial.login("lal.aswathy@gmail.com", "pass123");

		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.Women.click();

		Women woo = PageFactory.initElements(driver, Women.class);

		woo.Women_Tops.click();
		woo.Women_Tops_blouses.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		// To scroll down the page

		System.out.println((driver.findElement(By.xpath("(//div/span[@class='price product-price'])[2]"))).getText());
		String price = (driver.findElement(By.xpath("(//div/span[@class='price product-price'])[2]"))).getText();

		// Continue with the order if the price matches with 27$

		Assert.assertEquals(price, "$27.00");

		WebElement mainMenuBTN = driver.findElement(By.xpath("//a[@class='product_img_link']/img"));

		WebElement element = driver
				.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']/span"));

		// Hovers mouse over the image to make "ADD to cart" visible
		Actions builder = new Actions(driver);
		builder.moveToElement(mainMenuBTN).build().perform();
		builder.moveToElement(element).build().perform();

		if (element.isDisplayed()) {
			System.out.println("Found it");
			element.click();
		}

		WebElement Proceed = driver.findElement(By.xpath("//div[@class='button-container']/a[1]"));

		Thread.sleep(3000);

		if (Proceed.isDisplayed()) {
			System.out.println("Found Proceed");
			Proceed.click();
		}

		System.out.println(driver.findElement(By.xpath("//td[@class='price']/span")).getText());

		/*
		 * if (cart.Price.isDisplayed()) { String cartPrice =
		 * cart.Price.getText(); System.out.println(cartPrice); }
		 */

	}

}
