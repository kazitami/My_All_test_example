package COM.JAVA.Day3;

public class inc_dec_Operators_example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		
		int j= i-- -i++ + ++i;
			// j = 10 - 9 + 11 = 12 
		
			// position of i =  9, 10, 11 = i is 11 
			System.out.println("i is " + i+ ", j is "+ j);
			System.out.println();
			
		int k = --i + --j - j-- + i++ + --i;
		// equation k = 10 + 11 - 11 + 10+10 =  30 // latest value of k is 30
		// position of i = 10, 11, 10 = 10// latest value of i is 10
		// position of j = 11, 10  = 10 // latest value of j is 10
		System.out.println("k is " + k+ ", i is " +i+",j is "+ j);
		
		int l = i++ + j++ + ++k - --k + k--;
		// equation l =  10 +10 + 31 -30 + 30 = 51
		// position of i = 11 
		// position of j = 11
		// position of k = 31,30 29 
				
		
		System.out.println
				("l is " + l+
				 ", i is " + i + 
				 " , j is " + j +
				 ", k is " + k);
		
		
		System.out.println();
		System.out.println();
		System.out.println("i is " + i);
		System.out.println("j is " + j);
		System.out.println("k is " + k);
		System.out.println("l is " + l);
	}

}
