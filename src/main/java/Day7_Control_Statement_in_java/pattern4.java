package Day7_Control_Statement_in_java;

public class pattern4 {
//
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 	
	
	public static void main(String[] args) {
		pattern4_practice();
		System.out.println();
		
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}


		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		//pattern_diamond();
	}
	public static void pattern4_practice() {
		
	}
	public static void pattern_diamond() {
//		    *
//		   ***
//		  *****
//	     *******
//	    *********
//	   ***********
//	    *********
//	     *******
//	      *****
//	       ***
//	        *
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		
	}

}