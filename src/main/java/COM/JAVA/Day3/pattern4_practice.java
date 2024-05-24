package COM.JAVA.Day3;

public class pattern4_practice {

	public static void main(String[] args) {
		patern6();
		pattern5();
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
						System.out.print("[ "+j+"]");
					}
					for(int k=5;k>=i;k--)
					{
						System.out.print("[*"+k+"]");
					}
					System.out.println();
				}
			}
	//-------------------------------	
			public static void pattern5() {
				System.out.println("--------------");
				for (int i=5;i>=1;i--) {
					for(int j=1;j<=i;j++) {
						System.out.print("* ");
					}
					for(int k=5;k>=i;k--) {
						System.out.print("- ");
					}
					System.out.println();
				}
			}
}
