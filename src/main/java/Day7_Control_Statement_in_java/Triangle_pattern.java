package Day7_Control_Statement_in_java;

public class Triangle_pattern {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int m=3;m<=i;m++) 
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
