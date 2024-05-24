package JavatestExample;

public class accessingAllElementInArray {

	public static void main(String[] args) {
		
		 System.out.println("Value of Two Dimensional Array:");
		int[][] a = {{5,2,9},{4,6,8}};
		
		 for(int col=0;col<a.length;col++) {
			 
			 for(int row=0;row<a[col].length;row++) {
				 System.out.print(a[col][row]+" ");
			 }
			 System.out.println();
		 }
	}
}