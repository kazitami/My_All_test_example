package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class customized_xpath {

			//Money

			//a[@class = 'mailicon']/following-sibling::a[1]
			//div[@class = 'cell topicons']/child::a[2]
			//div[@class = 'cell topicons']/child::a[text() = 'Money']
			//div[@class = 'cell topicons']/child::a[contains(text(), 'Money')]
			//div[@class = 'cell topicons']/child::a[@class = 'moneyicon relative']
			//div[@class = 'table']/child::div[@class = 'cell topicons']/child::a[2]
			//div[@class = 'table']/child::div[@class = 'cell topicons']/descendant::a[2]


			//Create Account

			//div[@id = 'div_advt_x01']/preceding::a[text() = 'Create Account']
			//div[@class = 'navbar']/preceding-sibling::div[2]/preceding::a[text() = 'Create Account']
			//input[@id = 'OAS_subsection']/following-sibling::div[1]/descendant::div[@class = 'cell topicons']/following-sibling::div[1]/descendant::a[2]
			
	//--------------------------------------------------
	//traverse means movement within the html tags
	//represented by a forward slash

	//parent
	//child
	//ancestor
	//descendant
	//following-sibling
	//preceding-sibling
	//following
	//preceding
	//self

	//li[@class = 'logo']/descendant::img[1]
	//ul[@id = 'first-level-nav']/descendant::img[1]
	//nav[@id = 'nav-website']/descendant::img[1]
	//div[@id = 'banner_android']/following-sibling::nav[1]/descendant::img[1]
	//div[@id = 'banner_android']/following::img[1]

	//a[@class = 'signin']/following-sibling::a[1]
	//p[@id = 'signin_info']/child::a[2]
	//p[@id = 'signin_info']/child::a[text() = 'Create Account']
	//p[@id = 'signin_info']/child::a[contains(text(), 'Create Account')]

	//div[@id = 'red_container_main']/preceding::a[text() = 'Create Account']
	//div[@id = 'red_container_main']/preceding-sibling::div[@class = 'srchbar clear-fix relative']/preceding::a[1]

	//a[@class = 'signin']/parent::p
	//a[@class = 'signin']/parent::p[1]
	//a[@class = 'signin']/parent::*
	//a[@class='signin']/ancestor::p	
	}
	



