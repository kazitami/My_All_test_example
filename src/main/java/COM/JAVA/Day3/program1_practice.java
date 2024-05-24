package COM.JAVA.Day3;

import java.util.Scanner;

public class program1_practice {

	public static void main(String[] args) {
		int a =1;
		System.out.println("a---" + a);
		int b = 2;
		System.out.println("b---" + b);
		b=a;
		System.out.println("b=a---" + b);
		System.out.println(program2());
		System.out.println("----------------------------------");
		pattern1();
		System.out.println("----------------------------------");
		pattern2();
		System.out.println("----------------------------------");
		pattern3();
		System.out.println("----------------------------------");
		
		program4();
				
	}
	
	// find largest number in an integer array
	public static int program2() {
	int[] arr = {10,20,30,40,80,50,60,70};
	
	int max = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
	}	
	
	public static void pattern1() {
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		
		for (int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void pattern2() {
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
				
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern3() {
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		//* * * *
		//* * *
		//* *
		//*
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void program4() {
		
		//print prime numbers
		for(int i=0;i<=20;i++)
		{
			System.out.println(i);
				
		}
		System.out.println("Type the numer");
		Scanner scan= new Scanner(System.in);
		
		
	}
	
}
