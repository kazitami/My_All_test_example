package JavatestExample;

public class accessingArrayValues {

	public static void main(String[] args) {
		int [][]a = {{5,2,9},{4,6,8}};
		System.out.print("The values of array is : ");
		for(int i=0;i<a.length;i++) {
			System.out.print("{");
			for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+ ",");
			}
			System.out.print("},");
		}
		

	}

}
