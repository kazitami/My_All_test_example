package Day20_Exception_Handling;

public class Topic_8_Throw_keyword {

	public static void main(String[] args) {//main method is acting as the caller method
		divideByZero();
		System.out.println("Hello");
	}
	
	public static void divideByZero() {//is origin of the exception
		int a=100, b=0,c;
		c=a/b;
		System.out.println(c);
		throw new ArithmeticException("I am trying to handle this exception by self");
		//throw should be last statement inside a method
	}

}
