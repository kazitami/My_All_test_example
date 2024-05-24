package COM.JAVA.Day3;

import test_package_test_accessModifiers.program1;

public class Access_Modifiers {

	public static void main(String[] args) {
		// public - the code is accessible for all the classes
		// protected - the code is accessible in the same package and subclasses
		// private - the code is accessible only within the same class
		// default - code is accessible only within the same package
		AccessModifier_Public_Validation.test();// calling this method from another class
		program1.test2();
	}
	
	private static void secretCode() {
		System.out.println("Secret Code");
	}
	
	static void hello() {
		// this is a default method
	}
// class is only can be private and public
}
