package Day11_Apply_Variables_In_Automation;

public class Introduction__To_Variables {
		//There are 3 types of variables in Java	
		//generally instance and static variables are also called Class Variables or Global variables 
		//but it is not wise to call them Global
		
		//1. Instance Variables //also calls class variables
		//2. static variables   // also calls class variables
		//3. local variables 
		
		
		int age = 10; //this is known as an instance variable
		static String name = "John"; //name is a static variable

		public static void main(String[] args) {
			
		}
		
		
		public static void logic1(String S1, String S2) {
			int x;
			int y;  
			//x and y are local variables. They are local only to logic1() method
			//their scope lies within the logic1() method
			//S1 and S2 are also local variables
			
			//can we make a local variable static?
			//static int z = 23; //local variables cannot be associated with static keyword
			
			//by default local variables are non-static?
			//Answer: No...Local variables are neither static nor non-static
		}

}
