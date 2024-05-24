package Day22_Strings;

public class practice_String_Operations_Part2 {

	public static void main(String[] args) {
		//indexOf() method
		//this method is used to determine whether a given text or character is available in the String literal or not
		//if it is not available it will return -1
				
			String S1 = "We will be finishing Automation Course with Java Selenium in one month";
				
			System.out.println(S1.indexOf("with"));
			System.out.println(S1.indexOf('C'));
			System.out.println(S1.indexOf("in",25));
			
			String S2 = "This is a Selenium-Java Automation Software Testing a class Fall Batch 132";
			System.out.println("indexof a is: " + S2.indexOf("a"));
			System.out.println("indexof Automation is: " + S2.indexOf("Automation"));
			System.out.println("indexof Fall is: " + S2.indexOf("Fall"));
			//toString() method converts the different types of literal to String literal
			
			
			//toString
			int j_int = 34543; 
			//String s_toString =j_int.toString(j_int);
			
			String s = "23.6"; 
			float f = Float.parseFloat(s);
			System.out.println(f);
	}

}
