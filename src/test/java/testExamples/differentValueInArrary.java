package testExamples;

public class differentValueInArrary {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Assigned different values into a single array");
		System.out.println();
		Object[] differentTypeValue = {234,234.45,"Hello",true,'c'};
		for(int i=0;i<differentTypeValue.length;i++) {
				System.out.print(differentTypeValue[i] + " ");
			}
			
		}
	}