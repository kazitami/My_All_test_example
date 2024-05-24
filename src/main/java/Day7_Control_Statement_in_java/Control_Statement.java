package Day7_Control_Statement_in_java;

public class Control_Statement {
	
	// There are 3 types of control statements in java

	// 1. Selection or Conditional Statement
	// Examples - if, if else, if else if, switch
	
	// 2. Iteration or looping Statement
	// Example - while, for, for each (advanced for loop), do while
	
	// 3. Jump Statement
	// Example - break, continue, return
	
	public static void main(String[] args) {
		learningifstatement();
		determineLeapYear();
		checkingWithString();
		greatestof3Numbers();
		smallestof4numbers();
		checking_Smallest_Numbers();
		checking_Biggest_Numbers();
	}
		
		public static void learningifstatement() {
			// syntax
			// application of the syntax
			// sense of the ligic
			if (2<3) {
				System.out.println("The if condition is true");
			}else {
				System.out.println("The if condition is false");
			}
			
			if (2==3) {
				System.out.println("The if condition is true");
			}else {
				System.out.println("The if condition is false");
			}
		}
		public static void greatestof3Numbers() {
			int a = 21;
			int b = 31;
			int c = 41;
			if(a>b && a>c) 
			{
				System.out.println("a is the greatestNumbers"+ a);
			}else if (b>a && b>c) {
					System.out.println("b is the greatestNumbers"+ b);
			}else {
				System.out.println("C is the greatestNumbers "+ c);
			}
			}
			
			
			public static void smallestof4numbers() {
				int a = 11;
				int b = 21;
				int c = 31;
				int d = 41;
				
				if(a<b && a<c && a<d) {
					
						System.out.println("a is the smallest "+ a);
					}else if (b<a && b<c && b<d) {
						System.out.println("b is the smallest "+ b);
					}else if (c<a && c<b && c<d) {
						System.out.println("c is the smallest "+ c);
					}else {
						System.out.println("d is the smallest "+ d);
					}
						
				
		}
			
			public static void determineLeapYear() {
				int year1 = 1996;
				int year2 = 2002;
				int year3 = 2004;
				int year4 = 1700;
				//if (year1 % 4 == 0 || year1 % 4 == 0 || year1 % 4 == 0)
				//{
				//	System.out.println("Leap Year");
				//}
				// divided by 4
					if (year1 % 4 == 0) {
						System.out.println("year1 is a leap year");
					}else if (year2 % 4 == 0) {
						System.out.println("year2 is a leap year");
					}else if (year3 % 4 == 0) {
						System.out.println("year3 is a leap year");
					}else if (year3 % 4 == 0) {
							System.out.println("year3 is a leap year");
					}else {
						System.out.println("This year is not  a leap year");
					}
			}
			
			public static void checkingWithString() {
				String s1 = "Hello";
				String s2 = "World";
				String s3 = "Hello";
				String s4 = "Java";
				if (s1 == s2) {
					System.out.println("waoo");
				}else {
					System.out.println("Hello");
				}
				
			}
			public static void checking_Smallest_Numbers() {
				int a=23;
				int b=54;
				int c=34;
				int d=56;
				if(a<b && a<c && a<d)
				{
					System.out.println("a is smallest number " + a);
				}else if (b<a && b<c && b<d)
				{
					System.out.println("b is smallest number " + b);
				}else if (c<a && c<b && c<d)
				{
					System.out.println("c is smallest number " + c);
				}else
				{
					System.out.println("d is smallest number " + d);
				}
				
			}
			public static void checking_Biggest_Numbers(){
				int a=23;
				int b=54;
				int c=34;
				int d=56;
				if(a>b && a>c && a>d)
				{
					System.out.println("a is biggest number " + a);
				}else if (b>a && b>c && b>d)
				{
					System.out.println("b is biggest number " + b);
				}else if (c>a && c>b && c>d)
				{
					System.out.println("c is biggest number " + c);
				}else
				{
					System.out.println("d is biggest number " + d);
				}
			}
			
				
}	
			
		
	

