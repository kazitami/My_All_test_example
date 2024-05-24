package addTocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class categoryPage {
	public WebDriver driver;
	
	@FindBy(css = "div.button-group>button>span")
	private WebElement ClickOnavailabeProdutc;
	
	
	public categoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnToNavigateProductDetailsPage() {
		ClickOnavailabeProdutc.click();
	}
}
