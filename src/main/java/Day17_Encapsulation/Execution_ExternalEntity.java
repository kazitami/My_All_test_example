package Day17_Encapsulation;

public class Execution_ExternalEntity {

	public static void main(String[] args) {
		Student_EncloseUnit_Practice student = new Student_EncloseUnit_Practice();
		student.setData("Alan", 10, 3.45);
		
		
		System.out.println(student.getNameOfStudentData());
		System.out.println(student.getAgeOfStudentData());
		System.out.println(student.getHeightOfStudentData());
	}

}
