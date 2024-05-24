package JavatestExample;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class nestedLoop {

	public static void main(String[] args) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("outer for loop is : " + i);
				for (int j = 1; j <= 5; j++) {
					System.out.println("The value of inner for loop is : " + j);


				}

			}
		
	
		//---------------------------------------------------
		for(int i=1;i<=5;i++) {
			if(i<5) {
			System.out.print(i + ", ");
			}
			else
			{
				System.out.println(i);
			}
		}
		
		//----------------------------------------------------
		for(int i=10;i>=1; i--) {
			System.out.print(i+" ");
		}
		//-----------------------------------------------------
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*2 + " ");
		}
		//-------------------------------------------------------
		System.out.println();
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.println("sum "+ sum);
		
		
		//---------------------------------------------------------
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Outer For Loop " + i);
			System.out.println("***************************");
			for(int j=1;j<=5;j++)
			{
				System.out.println("Inner For Loop " + j);
			}
			
		}
		//------------------------------------------
		//* * * * * 
		//* * * * * 
		//* * * * * 
		//* * * * * 
		//* * * * * 
		System.out.println("-------------------------------------------------------");
		System.out.println();
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<6;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------");
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		System.out.println();
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------");
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
//		System.out.println();
		for(int i=1;i<6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//-----
		System.out.println("-------------------------------------------------------");
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
	
//				 	* 
//			      * * 
//			    * * * 
//			  * * * * 
//			* * * * * 
//				
		for(int row=1;row<6;row++)
		{
			for(int space=5;space>row;space--)
			{
				System.out.print("  ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
//			* * * * * 
//			  * * * * 
//			    * * * 
//			      * * 
//			        * 
		
		System.out.println("-------------------------------------------------------");
		
		for(int row=1;row<6;row++)
		{
			for(int space=1;space<row;space++)
			{
				System.out.print("  ");
			}
			for(int star=5;star>=row;star--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
	}
}