package testExamples;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class getOptionsMethod {
	public WebDriver driver;
	public ChromeOptions options;
	@Test
	public void getOptions() throws Exception {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximize");
	options.addArguments("--incognito");
	//options.addArguments("--disable-popup-blocking");
	//options.addArguments("--disable-notifications");
	options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
	options.setExperimentalOption("excludeSwitches",Arrays.asList("--disable-popup-blocking"));	
	driver = new ChromeDriver(options);
	driver.get("https://www.spicejet.com/");
	
//	Select getValueList = new Select(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")));
//	List <WebElement> op = getValueList.getOptions();
//	for(int i=0;i<op.size();i++) {
//		String options = op.get(i).getText();
//		System.out.println(options);
//	}
	
//closing driver
//driver.quit();
	
	
}
}