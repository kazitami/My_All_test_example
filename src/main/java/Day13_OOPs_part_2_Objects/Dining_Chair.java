package Day13_OOPs_part_2_Objects;

public class Dining_Chair {
	String purpose;
	String color;
	int height;
	int weight;
	static int leg;
	static String looks;
	public static void main(String[] args) {
		Dining_Chair chair = new Dining_Chair();
		System.out.println("All the chair has fixed " + (Dining_Chair.leg=4)+ "legs");
		System.out.println("All the chair looks " + (Dining_Chair.looks="Beautiful"));
		System.out.println("Color of the chair " + (chair.color="White"));
		System.out.println("Height " + (chair.height=50));
		System.out.println(chair.purpose="For Dining room");
		System.out.println("Weight " + (chair.weight=40));
		chair.multipurpose();
		chair.weight_can_hold();
		chair.width_of_the_Chair();
		
	}

	public void weight_can_hold() {
		System.out.println("Up to 300 lb");
	}
	public void width_of_the_Chair() {
		System.out.println("Up to 20 Inch ");	
	}
	public void multipurpose() {
		System.out.println("You can use it anywhere");	
	}
}