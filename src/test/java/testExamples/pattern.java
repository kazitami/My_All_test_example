package testExamples;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class pattern {
//how to compare two string
	public static void main(String[] args) {
		System.out.println("----------------------pattern-1------------------------------");
		pattern1();
		System.out.println("----------------------pattern-2-------------------------------");
		pattern2();
		System.out.println("----------------------pattern-3-------------------------------");
		pattern3();
		System.out.println("----------------------pattern-4-------------------------------");
		pattern4();
		System.out.println("----------------------pattern-5-------------------------------");
		pattern5();
		
	}
	//-----------------------------------------------------
	public static void pattern1() {
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	//-----------------------------------------------------
	
	//-----------------------------------------------------
		public static void pattern2() {
			//* * * * *
			//* * * * 
			//* * * 
			//* * 
			//*
			for(int i=0;i<5;i++) {
				for(int j=5;j>i;j--) {
					System.out.print("*  ");
				}
				System.out.println();
			}
		}
		//-----------------------------------------------------
		
		//-----------------------------------------------------
				public static void pattern3() {
					//* 
					//* *
					//* * *
					//* * * * 
					//* * * * *
					for(int i=0;i<5;i++) {
						for(int j=0;j<=i;j++) {
							System.out.print("*  ");
						}
						System.out.println();
					}
				}
		//-----------------------------------------------------
				
		//-----------------------------------------------------
				public static void pattern4() {
					//        *
					//      * *
					//    * * *
					//  * * * *
					//* * * * *
					for(int i=0;i<5;i++) {
						for(int j=0;j<=i;j++) {
							System.out.print("- ");
						}
						for(int j=4;j>=i;j--) {
							System.out.print("* ");
						}
						System.out.println();
					}					
				}
		//-----------------------------------------------------
		//-----------------------------------------------------
				public static void pattern5() {
					//*       
					//* *     
					//* * *    
					//* * * * 
					//* * * * *
					//* * * *
					//* * *
					//* *
					//*
					
					for(int i=0;i<5;i++) {
						for(int j=0;j<=i;j++) {
							System.out.print("*  ");
						}
						
						System.out.println();
					}
					for(int i=1;i<5;i++) {
						for(int j=4;j>=i;j--) {
							System.out.print("*  ");
						}
						
						System.out.println();
					}
					
				}
		//---------------------------------------------------
				
				
}
