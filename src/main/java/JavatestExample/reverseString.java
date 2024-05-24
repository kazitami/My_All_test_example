package JavatestExample;

public class reverseString {

	public static void main(String[] args) {
		String myString = "Selenium - Java";
		
		String MyReverseString = "";
		
		for(int i=myString.length()-1;i>=0;i--) {
			MyReverseString = MyReverseString + myString.charAt(i);
		}
		System.out.println("Reversed String --> " + MyReverseString);
	}

}
