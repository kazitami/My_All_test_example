package Day7_Control_Statement_in_java;

public class pattern_Diamond {

	public static void main(String[] args) {
//			*
//		   **
//		  ***
//		 ****
		for(int i=-1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int m=1;m<=i;m++) {
				System.out.print("*");
			}
				System.out.println();
			}
			
		
		
		//* * * * *        
		//  * * * *      
		//    * * *    
		//      * *  
		//        *
		
		//System.out.println("--------------");
				//--------------------------
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int n=4;n>=i;n--) {
				System.out.print("*");
			}
				System.out.println();
			}
		}

	

	}
