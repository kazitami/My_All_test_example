package COM.JAVA.Day3;

public class Importance_Main_Method {
	// main method is the center of execution of a java program
	// protected static void main
	// main is a method in java
	// every method in java has a return type. The return type of main method in java is void.
	// main is the name of the method 
	// methods have bodies which is represented in curly bracket {  }
	// String[] - [] represents a dimension. So technically this is 1-D and it is an array
	// args -  this is arguments
	// can replace [] with three dots ... 
	static public  void main(String[] args) {
		//public is access modifier
		System.out.println(1+2);
		test();// this is how you call a static method inside the main method

	}
	public static void test() {
		System.out.println(20+30);
	}
	

}
