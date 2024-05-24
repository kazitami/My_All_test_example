package Day13_OOPs_part_2_Objects;

public class New_Student {
	//Object is collection of all the non static entities of the Class
	static String studentName;
	int studentAge;
	int studentHeight;
	int studentWeight;
	
	public static void main(String[] args) {
		New_Student student = new New_Student();
		
		//you can call a static entity directly or with the help of the classname
		//if you want to call a non-static entity you have to create the object
		finalGrade();
		System.out.println("Age " + (student.studentAge=12));
		System.out.println((student.studentHeight=64) +" Inch");
		System.out.println((student.studentWeight=100) + " LB");
		student.grade();
		student.major();
		
	}
	public void grade() {
		//this is a non-static entity
		System.out.println("Grade 7");
	}
	public void major() {
		System.out.println("Major Science");
	}
	
	public static void finalGrade() {
		System.out.println("Final Grade A+");
	}
}
