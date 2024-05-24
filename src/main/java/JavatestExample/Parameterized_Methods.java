package JavatestExample;

public class Parameterized_Methods {

	public static void main(String[] args) {
		addTwoNumbers(20,30);
		compareTwoValues("Hello", "Hello");
	}
	
	public static void addTwoNumbers(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void compareTwoValues(String S1,String S2) {
		System.out.println(S1.equals(S2));
	}

}
