package Day18_Wait_BrowserOptions;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TutotialNinja {
		public WebDriver driver;
		public ChromeOptions options;
		
		@Test
		public void TuturialsninjaLogin() {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximize");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
			driver = new ChromeDriver(options);

			driver.get("https://www.tutorialsninja.com/demo/");
			
}
}
