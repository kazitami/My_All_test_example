package Day11_OOPs_part_1_Methods;

public class Parameterized_Methods {
	
	public static void main(String[] args) {
		addTwoNumbers(1,2);
		compareTwoValues("Hello", "Hello");
		
	}
	
	
	
	public static void addTwoNumbers(int i, int j) {
		System.out.println(i+j);
	}
	
	public static void compareTwoValues(String S1, String S2) {
		System.out.println(S1.equals(S2));
		
	}
}