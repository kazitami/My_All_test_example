package Day21_Scanner_wrapper_String;

import java.util.Scanner;

public class Practice_Calculator {

	public static void main(String[] args) {
		//Simple Calculator
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int FirstNumber = scan.nextInt();
		
		System.out.println("Please enter second number");
		int SecondNumber = scan.nextInt();
		
		System.out.println("Please select the operator (+,-,*,/)");
		String MathmaticalOperator = scan.next();
		
		int result;
		
		switch(MathmaticalOperator) {
		case "+": result = FirstNumber + SecondNumber;
		System.out.println("The sum of two number is: "+result);
		break;
		
		case "-": result = FirstNumber - SecondNumber;
		System.out.println("The difference of two number is: "+result);
		break;
		
		case "*": result = FirstNumber * SecondNumber;
		System.out.println("The multiplication of two number is: "+result);
		break;
		
		case "/": result = FirstNumber / SecondNumber;
		System.out.println("The division of two number is: "+result);
		break;
		
		default:
		System.out.println("You selected Invalid Operator");
		break;
			
		
		}

	}

}
