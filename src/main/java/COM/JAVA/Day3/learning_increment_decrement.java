package COM.JAVA.Day3;

public class learning_increment_decrement {

	public static void main(String[] args) {
	
		int i = 5;
		
		int j = i++ + --i;
			// equation of j value is 5 + 5 = 10
			// position of i is 6, 5 // latest value of i is 5
			System.out.println("latest value of i is : " +i);
			System.out.println("value of j is : " +j);
			
		int k = i-- + j++ - i++ - --j + j++;
		// value of k is = i5 + j10 - i5 - j10 + j11 = 11 
		// position of i is 4, 5 // latest value of i is 5
		// position of j is 11,10,11 // latest value of j is 11
				System.out.println();
				System.out.println();
				System.out.println("value of k is :"+k);
				System.out.println("position of i is :"+i);
				System.out.println("position if j is :" + j);
				System.out.println();
				System.out.println();
		
		int l = --k + k++ - j-- + ++j - ++i + i--;
		// value of l is 10 + 10 - 11 + 11 - 6 + 6 = 20 
		// position of k is 10,11 // latest value of k is 11 
		// position of j is 10,11 // latest value of j is 11
		// position of i is 6, 5 // latest value of i is 4
		System.out.println("value of l is :"+l);
		System.out.println("position of j is :"+j);
		System.out.println("position if i is :" + i);
		System.out.println("position if k is :" + k);
		
	
	
	}

}
