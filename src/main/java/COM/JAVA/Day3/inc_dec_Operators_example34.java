package COM.JAVA.Day3;

public class inc_dec_Operators_example34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1; //latest value of i is 1
		int j=i++; // at this position latest value of j is 1, and i is 2
		// j = 1
		int k = ++i + j++;//at this position i=3, j=2, k=4
		// k = 3 + 1=4
		//i=3
		//j=
		
		int l = ++i + ++j + k++ + i++; // 
		//l = 4 + 3 + 4
		// i=5
		//j = 3
		// k= 5
		
		System.out.println("i is " + i);// 5
		System.out.println("j is " + j);// 3
		System.out.println("k is " + k);// 5
		System.out.println("l is " + l);// l is 16
		
		
		//---------------------------------------
		
		
		
	}

}
