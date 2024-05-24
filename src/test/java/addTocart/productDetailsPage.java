package addTocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addToCartButtonOnDetailsPage;
	
	@FindBy(css = "button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle")
	private WebElement clickOnViewItemsButton;
	
	@FindBy(css = "a>strong")
	private WebElement clickOnViewCartButton;
	
	public productDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNavigateToCartPage() {
		addToCartButtonOnDetailsPage.click();
		clickOnViewItemsButton.click();
		clickOnViewCartButton.click();
	}
}
