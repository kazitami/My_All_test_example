package Day21_Wrapper_Class;

public class Topic5_parsing {
//Parsing means converting a String representation of a value into its corresponding data type
 
	public static void main(String[] args) {
		stringToInteger();
		stringToDouble();
		stringToBoolean();
		stringTolong();
		stringToFloat();
	}
	
	public static void stringToInteger() {
		String price1 = "400";
		String price2 = "250";
		
		System.out.println("String : " + (price1 + price2));
		//String to Integer
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		System.out.println("String to Integer : " + (p1 + p2));
		
	}
	
	public static void stringToDouble() {
		String price1 = "1.11";
		String price2 = "2.22";
		
		System.out.println("String : " + (price1 + price2));
		//String to Integer
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		System.out.println("String to Double : " + (p1 + p2));
		
	}
	
	public static void stringToBoolean() {
		String bTrue = "True";
		String bFalse = "False";
		//String to Boolean
		boolean b = Boolean.parseBoolean(bTrue);
		boolean b2 = Boolean.parseBoolean(bFalse);
		System.out.println("String to Boolean : " + (b==b2));
		
	}
	
	public static void stringTolong() {
		String bLong = "500";
		String cLong = "600";
		long p1 = Long.parseLong(bLong);
		long p2 = Long.parseLong(cLong);
		System.out.println("String to Long Value : " + (p1+p2));
		
	}
	
	public static void stringToFloat() {
		String bFloat = "500.90";
		String cFloat = "600.80";
		float p1 = Float.parseFloat(bFloat);
		float p2 = Float.parseFloat(cFloat);
		System.out.println("String to Long Value : " + (p1+p2));
		
		
		String n = new String("Sparkling");
		n.concat("Water");
		System.out.println(n);
		String s = "Apple";
		System.out.println(n.concat("Guava"));
		String s1 = s.concat("Guava");
		System.out.println(s1);
	}
	
}
	
	

