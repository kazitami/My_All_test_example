package Day23_WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_Assignment_centralBank {
	public WebDriver driver;
	
	@Test
	public void assignment1() {
		String companyName = "Tata Chemicals";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		for(int i=0;i<companyNames.size();i++) {
				if(companyName.equals(companyNames.get(i).getText())){
					System.out.println("Company Name " + companyNames.get(i).getText() + " ---- Current Price " + currentPrice.get(i).getText());
					break;
				}
			
		}
	}
	
	@Test
	public void assignment2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		WebElement companyName = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1000]/td[1]"));
		String CompName = companyName.getText();
		
		for(int i=0;i<companyNames.size();i++) {
				if(CompName.equals(companyNames.get(i).getText())){
					System.out.println("Company Name " + companyNames.get(i).getText() + " ---- Current Price " + currentPrice.get(i).getText());
					break;
				}
			
		}
	}
	@Test
	public void assignment3() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> first5rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() > 0 and position() <= 5]"));
		System.out.println("------------------------------First 5 rows----------------------------------------");
		for(int i=0 ; i<first5rows.size() ; i++) {
			System.out.println(first5rows.get(i).getText());
		}
		
		
		
		//-----------------------------------------------
		List<WebElement> middle5rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() > 95 and position() <= 100]"));
		System.out.println("------------------------------Middle 5 rows----------------------------------------");
		for(int i=0 ; i<middle5rows.size() ; i++) {
			System.out.println(middle5rows.get(i).getText());
		}
		
		
		
		//--------------------------------------------------------
		
		List<WebElement> last5rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() > 1194 and position() <= 1199]"));
		System.out.println("------------------------------Last 5 rows----------------------------------------");
		for(int i=0 ; i<last5rows.size() ; i++) {
			System.out.println(last5rows.get(i).getText());
		}
		
		//--------------------------------------------------------
		List<WebElement> last5rows1 = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr"));
		System.out.println("------------------------------Last 5 rows without giving position----------------------------------------");
		System.out.println(last5rows1.size());
				
			
		
		}	
	
	@Test
	public void assignment4() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		String[] FiveCompanyNames = {"Mukka Proteins","AutoCorpn of Goa","BDH Industries","Rallis India","Tata Chemicals"};
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		
		for(int i=0;i<companyNames.size();i++)
		{
			for(String conpanyName:FiveCompanyNames) {
				if(conpanyName.equals(companyNames.get(i).getText())) {
					System.out.println(companyNames.get(i).getText() + " ---- " + currentPrice.get(i).getText());
					break;
				}
			}
		}
		


	}
		
}
