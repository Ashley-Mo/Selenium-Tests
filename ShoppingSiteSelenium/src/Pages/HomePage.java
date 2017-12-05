package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='search_query_top']")
	public WebElement MySearch;
	// locator for My search

	@FindBy(how = How.XPATH, using = ".//*[@id='searchbox']/button")
	public WebElement Search_Button;
	// locator for My search button locator

	@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[1]/a")
	public WebElement Women;
	// locator for Women button locator

	@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement Dresses;
	// locator for dresses button locator

	@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[3]/a")
	public WebElement T_Shirts;
	// locator for T-Shirts button locator

}
