package Day7_Control_Statement_in_java;

public class pantagon_pattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=1;m<=8;m++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			for(int j=8;j>=m;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
