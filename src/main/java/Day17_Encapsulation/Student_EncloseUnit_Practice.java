package Day17_Encapsulation;

public class Student_EncloseUnit_Practice {
	
	//1. Declare the instance variable as private
	private String name;
	private int age;
	private double height;
	
	public void setData(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getNameOfStudentData() {
		System.out.println("This is Student Name");
		return name;
	}
	public int getAgeOfStudentData() {
		return age;
		
	}
	public double getHeightOfStudentData() {
		return height;
	
}
}
