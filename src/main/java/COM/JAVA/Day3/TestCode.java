 package COM.JAVA.Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCode {

	public static void main(String[] args) {
		
//		for_loop();
//		switch_example1();
//		if_statement_example1();
//		if_statement_example2();
//		switch_statement_example2();
//		for_loop_example2();
//		for_loop_example3();//endless loop
//		for_loop_50_natural_numbers_and_sum();
//		even_numbers();
//		while_loop();
//		while_loop_string();
//		while_loop_natural_100_numbers();
//		for_loop_insidewhileloop();
//		for_loop_inside_for_loop();
//		patern1();
//		patern2();
//		patern3();
//		patern4();
		patern5();
		patern6();
	}
	public static void for_loop_insidewhileloop() {
		int a=1;
			while(a<10) {
				for(int j=1;j<9;j++) {
					System.out.println(23+37);
				}
				//a++;if i do a++, then a will run 9 times 
				break;//it will run only once
			}
			System.out.println("This is while loop body");
	}
	//-------------------------------
			//* * * * *        
			//  * * * *      
			//    * * *    
			//      * *  
			//        *
			
			
			public static void patern6() {
				System.out.println("--------------");
				for(int i=1;i<=5;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print(" ");
					}
					for(int k=5;k>=i;k--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
		//-------------------------------	
	//-------------------------------
		//        *
		//      * *
		//    * * *
		//  * * * *
		//* * * * *
		
		
		public static void patern5() {
			System.out.println("--------------");
			for(int i=1;i<=5;i++) {
				for(int j=4;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	//-------------------------------	
	
	//-------------------------------
	//*
	//* *
	//* * *
	//* * * *
	//* * * * *
	//* * * *
	//* * *
	//* *
	//*
	
	public static void patern4() {
		System.out.println("--------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
//-------------------------------	
	//-------------------------------
			//* * * * *
			//* * * *
			//* * *
			//* *
			//*
			public static void patern3() {
				System.out.println("--------------");
				for(int i=1;i<=5;i++)
				{
					for(int j=5;j>=i;j--)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
			}
		//-------------------------------	
	//-------------------------------
	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *
	public static void patern1() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//-------------------------------
		//*
		//**
		//***
		//****
		//*****
		public static void patern2() {
			System.out.println("--------------");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	//-------------------------------	
	
	//-------------------------------
	
	//-------------------------------
		
	//-------------------------------
	
	//-------------------------------
	public static void for_loop_inside_for_loop() {
		for(int i= 1; i<=5;i++) {
			System.out.println(" i value " + i);
			//logic of inner for loop
			for(int j=1; j<=5;j++) {
				System.out.println("j value " + j);
			}
			//some statement inside outer for loop
			
		}
	}	
	//-------------------------------
	public static void while_loop_natural_100_numbers() {
		System.out.println("---------");
		int i=1;
		System.out.println("Using while loop printing 100 natural number");
		while(i<=100) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("---------");
		int a=100;
		System.out.println("Using while loop printing 100 natural number");
		while(a>=1) {
			System.out.println(a);
			a--;;
		}
		
		System.out.println("---------");
		int j=1;
		while(j<=20) {
			System.out.print(j*5 + " ");
			j++;
		}
		System.out.println("---------");
		int k=1;
		while(k<=1083) {
			System.out.print(k*97 + " ");
			k++;
		}
	}
	
	//----------------------------------
	public static void while_loop_string() {
		String s1="World";
		while(s1.equals("World1")) {
			System.out.print("Hello World");
		}
	}
	
	//----------------------------------
	public static void while_loop() {
		int i=1;
		while(i<6) {
			//body
			System.out.println("i is - " + i);
			i++;
		}
		System.out.println("----------");
	}
	//----------------------------------
	public static void even_numbers() {
		System.out.println("---------");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*2 + " ");
		}
		System.out.println("---------");
	}
	//----------------------------------
	
	public static void for_loop_50_natural_numbers_and_sum() {
		System.out.println("---------");
		int sum=0;
		for(int i=1; i<=50;i++) {
			if(i==27)
			{
				System.out.println();
			}
			sum=sum+i;
			System.out.print(i+ " ");
		}
		System.out.println("---------");
		System.out.println();
		System.out.println("Sum of 50 number is " + sum);
	}
	//----------------------------------
	public static void for_loop_example2() {
		int sum = 0;
		for(int i=1;i<=50;i++) {
			{
				System.out.println();
			}
			System.out.print(" " + i);
			sum=sum+i;
		}
		System.out.println();
		System.out.println("Sum of the number is "+ sum);
	}
	
	//----------------------------------
	public static void switch_statement_example2() 
	{
		//---------------------------------------------------
		String browser = "Chrome";
		switch(browser) 
		{
		case "Chrome":WebDriver driver = new ChromeDriver();
					  driver.manage().window().maximize();
					  driver.get("https://www.google.com");
					  driver.quit();
					  break;
					  
		case "Firefox":WebDriver driver1 = new FirefoxDriver();
		  				driver1.manage().window().maximize();
		  				driver1.get("https://www.rediff.com");
		  				break;
		case "Edge":WebDriver driver2 = new EdgeDriver();
		  			driver2.manage().window().maximize();
		  			driver2.get("https://www.bestbuy.com");
		  			break;
		default:WebDriver driver3 = new InternetExplorerDriver();
		  		driver3.manage().window().maximize();
		  		driver3.get("https://www.amazon.com");
		  		break;
		}
	}
	//----------------------------------
	public static void if_statement_example2() {
		if(2==2)
		{
			if(1==1)
			{
				System.out.println("This is inner if");
			}
		System.out.println("This is outer if");
		}
	}
	//----------------------------------
	public static void if_statement_example1() {
		int a=1;
		int b=2;
		int c=3;
		if (a<b && b<c) 
		{
			System.out.print(b);
		}	//this code is working		
	}
	//----------------------------------
	public static void switch_example1() {
		//--------------------------------------------------
		//switch statement
		int a = 10;
		switch(a)
		{
		case 5 :System.out.println(a);
		case 6:System.out.println(a);
		case 10:System.out.println(a);
		default:System.out.println("nothing match");
		}
	}
	
	//----------------------------------
	public static void for_loop() {
				for(int i=1;i<=10;i++) {
					System.out.println(i);//body
				}
	}
	//----------------------------------
	
	public static void for_loop_example3() {
		System.out.println("---------");
		for (int i=2;i>=2;i=i+2)
		{
			if(i>20)
				{
				break;
				}
			System.out.println(i);
		}
	}
}
//----------------------------------
