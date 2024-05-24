package Day13_OOPs_part_2_Objects;

public class Student{

	
	String name="John";
	int grade=7;
	
	static String type="Human";
	static String color="Brown";
	
	public static void main(String[] args) {
		Student people = new Student();
		
		people.non_Static_Student1();
		people.non_Static_Student2();
		people.non_Static_Student3();
		
		Static_Student1();
		Static_Student2();
		Static_Student3();
		
		System.out.println("Instance-grade " + people.grade);
		
		System.out.println("static-color " + color);
		
		System.out.println("static-Type " + type);
		System.out.println("Instance-Name = " + people.name);	

	}
	public static void Static_Student1()
	{
		System.out.println("Static_Bina");
	}
	public static void Static_Student2()
	{
		System.out.println("Static_Rina");
	}
	public static void Static_Student3()
	{
		System.out.println("Static_Tam");
	}
	
	public  void non_Static_Student1()
	{
		System.out.println("Non_Static_Rekha");
	}
	public  void non_Static_Student2()
	{
		System.out.println("Non_Static_Hena");
	}
	public  void non_Static_Student3()
	{
		System.out.println("Non_Static_Adnan");
	}
	

}
