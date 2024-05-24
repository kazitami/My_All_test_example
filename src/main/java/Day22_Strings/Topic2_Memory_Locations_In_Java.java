package Day22_Strings;

public class Topic2_Memory_Locations_In_Java {

	//There are 5 memory locations in java
	//1. Heap Memory
	//2. Stack Memory
	//3. PC Register
	//4. Method area
	//5. Native Method area
	
	//Strings memory allocation moved from Method Area to Heap Memory in Java version 1.7
	//String objects will be stored in a niche memory location within Heap Memory - SCP or SLP
	//SCP(String Constant Pool / String Literal Pool)|
	public static void main(String[] args) {
		String S1= new String();//whenever we create an object using new keyword, the object gets created in heap memory
		//1. 1 object getting created HP
		
		String S2 = new String("Python");// "Python" is known as a Literal  - it gets create inside the Literal String
		//2 objects are getting created - 1 in HP and 1 in SLP
		
		String S3 = "Selenium";
		//1 object - SLP
		
		//jvm internal reference
		//String is pre-defined object with string we can create with new keyword, without new key word
	}

	

	}
