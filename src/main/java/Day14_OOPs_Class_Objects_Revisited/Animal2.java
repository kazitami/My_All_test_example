package Day14_OOPs_Class_Objects_Revisited;
//Initialize the object using methods
public class Animal2 {
	
	//Initialize the object using methods
	
	String color;
	int age;
	
	public static void main(String[] args) {
		Animal2 buzzo = new Animal2();
		buzzo.color="Fawn";
		buzzo.age=5;
		System.out.println(buzzo.color + " -Direct Print from main method- " + buzzo.age);
		
		buzzo.initializeObject("Black", 7);
		buzzo.display();

	}
	
	public void initializeObject(String c, int a) {
		color = c;
		age = a;
		System.out.println(c+ " =initializeObject Method= " +a);
	}
	
	public void display() {
		System.out.println(color + " --display Method-- " + age);
	}
	
	


}