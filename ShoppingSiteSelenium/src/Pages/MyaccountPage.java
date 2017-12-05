package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyaccountPage {

	private WebDriver driver;

	public MyaccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")
	public WebElement OrderHistory;
	// locator for Order history and details

	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/div/div[1]/ul/li[2]/a/span")
	public WebElement Mycreditslips;
	// locator for My credit slip and details

	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/div/div[1]/ul/li[3]/a/span")
	public WebElement MyAddress;
	// locator for My address and details

	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
	public WebElement MyPersonalInfo;
	// locator for My personal information and details

	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/div/div[2]/ul/li/a/span")
	public WebElement MyWishlist;
	// locator for My wish list and details

	@FindBy(how = How.XPATH, using = ".//*[@id='search_query_top']")
	public WebElement MySearch;
	// locator for My search

	@FindBy(how = How.XPATH, using = ".//*[@id='searchbox']/button")
	public WebElement Search_Button;
	// locator for My search button locator

	@FindBy(how = How.XPATH, using = ".//*[@id='header']/div[2]/div/div/nav/div[2]/a")
	public WebElement Signout;
	// locator for sign out button locator

	@FindBy(how = How.XPATH, using = ".//*[@id='header']/div[3]/div/div/div[3]/div/a/b")
	public WebElement Cart;
	// locator for cart button locator
}
