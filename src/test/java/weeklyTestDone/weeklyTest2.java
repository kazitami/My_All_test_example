package weeklyTestDone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

//------------------
public class weeklyTest2 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
		
	}
	
	public static void question1() {
		//1. Id, 2. name, 3. className, 4. linkText. 5. 
		//partiallinkText, 6. cssSelector, 7. xpath, 8. tagname
	}
	
	public static void question2() {
//		Question 2: Write a java program to print the 2nd 
//		smallest of three numbers.
		int a=1;
		int b=2;
		int c=3;
		
		if(a<b && a>c ||a>b && a<c)
		{
			System.out.println("second smallest number is "+ a );
		}else if(b<a && b>c ||b>a && b<c)
		{
			System.out.println("second smallest number is "+ b );
		}else
		{
			System.out.println("second smallest number is "+ c );
		}

	}

	public static void question3() {
	//ID has the highest priority in selenium.
	}

	public static void question4() {

		// Question 4: What you need to be more careful
		// when you directly select class locator?
		
		// answer: make sure it is unique locator.

	}

	public static void question5() {
		if(1==1){
			System.out.println("Hello");
		}else if(2==2){
			System.out.println("World");
		}
		// output is : Hello
	}

	public static void question6() {
		//Question 6: Write the code for logging in 
		//for https://tutorialsninja.com/demo website
		//	Username: seleniumpanda11@gmail.com
		//	Password: Selenium@123
		WebDriver driver = new ChromeDriver();// opening a driver instance
		driver.manage().window().maximize(); // maximizing the browser
		driver.get("https://tutorialsninja.com/demo/");// Opening a browser 
		driver.findElement(By.linkText("My Account")).click(); // My Account
		driver.findElement(By.linkText("Login")).click(); // clicking on login 
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda11@gmail.com"); // entering email address
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");// entering password
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();// clicking login button
	}
	
	public static void question7() {
//		Question 7: What is the html tag and attributes in 
//		the below element
//		&lt;a href=&quot;http://register.rediff.com/register/register.php?FormName=user_details&quot; title=&quot;Create
//		Rediffmail Account&quot;&gt;Create Account&lt;/a&gt;
		
//		answer: html tag is : - a
//		attributes is href and title 
	}
	public static void question8() {
		//Question 8: Under what circumstances you will not
		//choose id as a direct locator.
		
		//answer: if ID is not unique locator.
	}
	
	public static void question9() {
		//Question 9: if an element has id and class which one
		//should be selected and why? Write down all
		//factors that needs to be considered before deciding.
		
		//answer : we need to look for unique locators.
		//it can be ID or class based on uniqueness.and also simplest locator.
	}
	
	public static void question10() {
//		Question 10: What are the various control statements 
//		in Java		
		// There are 3 types of control statements in java

		// 1. Selection or Conditional Statement
		
		// 2. Iteration or looping Statement
		
		// 3. Jump Statement
		
	}

}
