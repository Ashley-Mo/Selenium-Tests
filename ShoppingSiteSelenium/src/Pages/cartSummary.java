package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class cartSummary {

	private WebDriver driver;

	public cartSummary(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//tr[@class='cart_total_delivery']/td[2]")
	public WebElement shipping;
	// locator for shipping

	@FindBy(how = How.XPATH, using = "//td[@id='total_product']")
	public WebElement Price;
	// locator for Price

	@FindBy(how = How.XPATH, using = "//td[@class='price']/span")
	public WebElement TotalPrice;
	// locator for TotalPrice

	@FindBy(how = How.NAME, using = "cgv")
	public WebElement CheckBox;
	// locator for CheckBox

	@FindBy(how = How.XPATH, using = "//p[@id='cart_navigation']/button/span/i[1]")
	public WebElement ConfirmOrder;
	// locator for ConfirmOrder

}
