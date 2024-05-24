package Day20_Exception_Handling;

public class Topic_5_Try_Catch_Block {
//DEH- Default Exception Handler
	//ExceptionName
	//ExceptionDescription
	//Stack Trace
	public static void main(String[] args) {
		try {//try block will hold the risky code
			int a = 100, b = 0, 
				c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			//catch block will hold the handling code
			e.printStackTrace();
		}
		
	}
	//Logic:- 
	//Exception will occur because of a programming mistake. The method which has the programming mistake -  typically should take responsibility 
	//to handle that mistake
	//Tha main() method will create as Object.
	//The object will have 3 entities -  ExceptionName, ExceptionDescription, StackTrace
	
	//this object will be passed to JVM. JVM will check if it can handle the object.
	//and in the meanwhile the main() method will get abruptly terminated.
	
	//Then DEH will print the Exception.
	
	//If you want to manually handle the Exception, then use try catch block
}
