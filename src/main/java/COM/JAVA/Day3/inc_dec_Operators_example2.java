package COM.JAVA.Day3;

public class inc_dec_Operators_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		i++; // i is 2
		
		System.out.println(i+200);// answer is 202 
		
		int j = i++ + i++ + i++;
		// j=2 + 3 + 4 = 9
		// i =2, 4, 5
		System.out.println("i = " + i);
		System.out.println("J = " + j);
		
	}

}
