package addTocart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class addToCartTest extends TestBase{

	
	public addToCartTest() throws Exception {
		super();
	}
	
	public WebDriver driver;
	public cartPage cartpage;
	public categoryPage categorypage;
	public HomePage homepage;
	public productDetailsPage productdetailspage;
	
	@BeforeMethod
	public void setup() {
	driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
	homepage = new HomePage(driver);
	
	}
		
	@Test
	public void addToCart() throws Exception {
		cartpage = new cartPage(driver);
		categorypage = new categoryPage(driver);
		productdetailspage = new productDetailsPage(driver);
		//categoryPage categorypage;
		//HomePage homepage;
		//productDetailsPage productdetailspage;
		homepage.clickOntoNavigateCartPage();
		Thread.sleep(2000);
		cartpage.ClickOnDeleteItemButton();
		Thread.sleep(2000);
		cartpage.ClickOntoNavigateTocategoryPage();
		Thread.sleep(2000);
		productdetailspage.clickOnNavigateToCartPage();
		Thread.sleep(2000);
		cartpage.ClickOnDeleteItemButton();
	}
	
	
	
	
}
