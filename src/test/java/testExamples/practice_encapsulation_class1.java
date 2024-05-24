package testExamples;

public class practice_encapsulation_class1 {

	private int radius;
	private static double pivalue=3.142;
	
	public void setters(double pivalue, int radius ) {
		
		this.radius = radius;
		this.pivalue=pivalue;
		
		//System.out.println(pivalue*(radius*radius));
	}
	
	public void getAreaOfCircle() {
		double area = pivalue * (radius*radius);
		System.out.print("The area of the circle is: "+ area);
	}
}
