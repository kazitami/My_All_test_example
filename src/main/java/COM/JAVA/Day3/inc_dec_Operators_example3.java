package COM.JAVA.Day3;

public class inc_dec_Operators_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		//int j=++i + ++i + ++i;
			//value of j =2 + 3 +4
			//i = 2,3,4 
		int j = i++ + i++ + i++;
		
		
		System.out.println(i);
		System.out.println(j);
	}

}
