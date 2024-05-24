package addTocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
	public WebDriver driver;

	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement WarningMessageForNotAvailableProduct;

	@FindBy(xpath = "Laptops & Notebooks")
	private WebElement MenuLaptopsAnsNotebooks;

	@FindBy(xpath = "//a[text()='Show AllLaptops & Notebooks']")
	private WebElement selectMenuShowAllLaptopsAndNotebooks;
	
	@FindBy(xpath = "//div[@class='input-group btn-block']/span/button[2]")
	private WebElement DeleteItemButton;
	
	@FindBy(xpath = "//a[text()='Checkout']")
	private WebElement checkoutButton;
	
	public cartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickOntoNavigateTocategoryPage() {
		MenuLaptopsAnsNotebooks.click();
		selectMenuShowAllLaptopsAndNotebooks.click();
	}
	
	public void ClickOnDeleteItemButton() {
		DeleteItemButton.click();
		checkoutButton.click();
	}
}
