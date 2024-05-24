package JavatestExample;

public class sumOfFirstHundredNumbers {

	public static void main(String[] args) {
		//sum of first 100 numbers
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum= sum+i;		
		}
		System.out.println("Sum of first 100 numbers -->  " + sum);
	}

}
