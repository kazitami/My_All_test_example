package Day21_Scanner_wrapper_String;

import java.util.Scanner;

public class Scanner_Concepts {

	public static void main(String[] args) {
		
		//Scanner class is a pre-defined class used to take use input while execution happens
		//java.util package
		//Scanner Class has a lot of built in method - next(), nextInt(), nextLong(), and you can also do method chaining
		
		Scanner scan = new Scanner(System.in);// "in" here in represents input
		
		//String
		System.out.println("Enter the name");
		String name = scan.next();
		
		//Gender -M or you can F or Male or female
		
		
		System.out.println("Enter the gender");
		char gender = scan.next().charAt(0);
		
		//Age - store as int
		System.out.println("Enter the age");
		int age = scan.nextInt();
		
		//Phone number - 2345623454
		System.out.println("Enter the contact number");
		
		long phonenumber = scan.nextLong();
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(phonenumber);
		
		//
		
	}

}
