package Day21_Scanner_wrapper_String;

import java.util.Scanner;

public class Practice_Scanner_Class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//String 
		System.out.println("Enter the name");
		String name = scan.next();
		
		System.out.println("Enter the Gender");
		char gender = scan.next().charAt(0); // next() method is used for String
		
		System.out.println("Enter the Age");
		int age = scan.nextInt();
		
		System.out.println("Enter the contact number");
		long phonenumber = scan.nextLong();
		
		System.out.println("Name of the person is : " + name);
		System.out.println("Name of the person is : " + gender);
		System.out.println("Name of the person is : " + age);
		System.out.println("Name of the person is : " + phonenumber);
	}

}
