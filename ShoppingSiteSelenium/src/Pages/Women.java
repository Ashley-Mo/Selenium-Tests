package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Women {

	private WebDriver driver;

	public Women(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='categories_block_left']/div/ul/li[2]/a")
	public WebElement Women_Dresses;
	// locator for dresses

	@FindBy(how = How.XPATH, using = ".//*[@id='categories_block_left']/div/ul/li[1]/a")
	public WebElement Women_Tops;
	// locator for Tops

	@FindBy(how = How.XPATH, using = ".//*[@id='categories_block_left']/div/ul/li[1]/a")
	public WebElement Women_Tops_Tshirts;
	// locator for Tops_tshirts

	@FindBy(how = How.XPATH, using = ".//*[@id='categories_block_left']/div/ul/li[2]/a")
	public WebElement Women_Tops_blouses;
	// locator for Tops_blouses

	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/ul/li/div")
	public WebElement Women_Tops_blouses_result;
	// locator for Tops_blouses_img

}
