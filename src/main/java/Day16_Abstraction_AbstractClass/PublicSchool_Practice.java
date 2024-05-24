package Day16_Abstraction_AbstractClass;

public class PublicSchool_Practice extends Student_Practice{
	//can a normal class extend Abstract Class - Yes
	//can the school class which is an abstract class act as a parent?? Yes
	
	//now you are giving body or implementation to the 
	//unimplemented methods of the parent Abstract Class
	
	@Override
	public void studentMarksheet() {
		System.out.println("Student's marksheet");
	}
	public void studentLibrary() {
		// we can also override regular methods
	}
	@Override
	public void studentPlayground() {
		System.out.println("Student Playground");		
	}
	//can the child class have its own methods? - yes 
	public void hallAssembly() {
		
	}
	public void schoolCafeteria() {
		
	}
	
}
