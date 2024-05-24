package COM.JAVA.Day3;

public class American_Flag {

	public static void main(String[] args) {
		
		
//		**********=================================
//		**********=================================
//		**********=================================
//		**********=================================
//		**********=================================
//		===========================================
//		===========================================
//		===========================================
//		===========================================
//		===========================================
//		===========================================
//		===========================================
//		===========================================
//		
		System.out.println();
		for(int row=0;row<5;row++) {
			for (int col=0;col<10;col++) {
				System.out.print("*");
			}
			for (int equal=9;equal<=43;equal++) {
				System.out.print("=");
			}
			System.out.println();
		}	
		for(int row=0;row<8;row++) {
			for (int equal=0;equal<=44;equal++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
//--------------------------------------------------		
		
		System.out.println();
		
		
		//-----------8 times table----------------------
		System.out.println("-------8 times table-------");
		int a=8;
		for(int i=0;i<=8;i++)
		{
			int j1= i*a;
			System.out.println((a) + "*" + (i)+ "=" +  (j1));
		}
		//--------------------------------
		System.out.println("-------Odd or Even-------");
		int n=11;
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
}
	
}