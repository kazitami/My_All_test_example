package Day16_Abstraction_AbstractClass;

public abstract class Student_Practice {
	//An abstract class can hold abstract methods
	//A regular class cannot hold abstract methods
	//An abstract class can hold also regular methods
	
	public abstract void studentMarksheet();
	//unimplemented or undefined method. This is also know as abstract method.
	//a method is know as unplimented if it has no body
	
	public abstract void studentPlayground();
	
	//public static abstract void studentBasketBallCourt();
	
	public void studentLibrary() {
		System.out.println("This is a normal method or a concrete method");
	}
	public static void studentPrayerRoom() {
		System.out.println("This is a static method inside abstract class");
	}
	
}
