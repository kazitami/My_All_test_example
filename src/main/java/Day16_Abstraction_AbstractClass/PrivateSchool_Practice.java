package Day16_Abstraction_AbstractClass;

public class PrivateSchool_Practice extends Student_Practice {

	public static void main(String[] args) {
		PrivateSchool_Practice privateschool = new PrivateSchool_Practice();
		privateschool.studentMarksheet();
		privateschool.studentPlayground();
		privateschool.studentLibrary();
		PrivateSchool_Practice.studentPrayerRoom();
		
		Student_Practice stud = new PrivateSchool_Practice();//here the Parent class reference is pointing to Child Class object.
		stud.studentMarksheet(); 
		stud.studentPlayground();
	}

	@Override
	public void studentMarksheet() {
		
	}

	@Override
	public void studentPlayground() {
		System.out.println("This is student Playground");
	}

}
