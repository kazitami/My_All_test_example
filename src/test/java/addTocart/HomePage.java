package addTocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;

@FindBy(css = "div.button-group")
private WebElement notAvailableProduct_addToCartButton;


@FindBy(css = "div.alert.alert-success.alert-dismissible")
private WebElement successfullyAddedMessage;

@FindBy(css = "button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle")
private WebElement itemsButton;

@FindBy(xpath = "//a/strong[contains(text(),'View Cart')]")
private WebElement viewCartButton;

public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void clickOntoNavigateCartPage() {
	notAvailableProduct_addToCartButton.click();
	itemsButton.click();
	viewCartButton.click();
}


}
