package Day13_OOPs_part_2_Objects;

public class Create_Animal {

	int age=4;
	int height=20;
	int weight=150;
	String color="Black";
	static String animal="Cow";
	static int  tail=1;
	
	public static void main(String[] args) {
		
		System.out.println();
		
		Create_Animal cow = new Create_Animal();
		cow.animalBehavior();
		cow.animalfood2();
		cow.animalfood3();
		Create_Animal.animalname();
		Create_Animal.animaltail();
	}


	public void animalBehavior() {
		System.out.println("Age--" + age);
		System.out.println("Height--" +height);
		System.out.println("weight--" + weight);
		System.out.println("color--" + color);
		
	}
	public void animalfood2() {
		System.out.println("corn");
	}
	public void animalfood3() {
		System.out.println("hay");
	}
	
	public static void animalname() {
		System.out.println("Animal Name " +animal);
		
		
	}
	public static void animaltail() {
		System.out.println("Cow has--"+ tail + " tail");
	}
}

