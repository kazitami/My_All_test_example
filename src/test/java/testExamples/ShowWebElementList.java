package testExamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ShowWebElementList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=18");
		List<WebElement> list = driver.findElements(By.id("input-sort"));
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i).getText());
		}
	}
}