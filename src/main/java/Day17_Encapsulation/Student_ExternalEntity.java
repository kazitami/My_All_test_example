package Day17_Encapsulation;

public class Student_ExternalEntity {

	public static void main(String[] args) {
		Student_EnclosedUnit student = new Student_EnclosedUnit();
		
		student.setData("Alan",10,3.45);
		
		System.out.println(student.getNameOfStudentData());
		System.out.println(student.getAgeOfStudentData());
		System.out.println(student.getHeightOfStudentData());
	}

}
