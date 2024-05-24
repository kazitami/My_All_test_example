package Day21_Scanner_wrapper_String;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// "in" here in represents input
		
		
		System.out.println("Please input number 1");
		int num1 = scan.nextInt();
		System.out.println("Please input number 2");
		int num2 = scan.nextInt();
		
		int add = num1 + num2;
		
		System.out.println("Addition - " + add);
		
		System.out.println("Choose the mathematical operation(+,-,*,/)");
		
		//------------------------------
		System.out.println("Please input number 1 for substruction");
		int sub1 = scan.nextInt();
		System.out.println("Please input number 2 for substruction");
		int sub2 = scan.nextInt();
		
		int sub3 = sub1 - sub2;
		
		System.out.println("Substruction - " + sub3);
		//-----------------------------------------
		
		
		System.out.println("Please input number 1 for multiplication ");
		int mul1 = scan.nextInt();
		System.out.println("Please input number 2 multiplication");
		int mul2 = scan.nextInt();
		
		int mul3 = mul1 * mul2;
		
		System.out.println("Multiplication - " + mul3);
		//----------------------------------------
		
		System.out.println("Please input number 1 for Div ");
		int div1 = scan.nextInt();
		System.out.println("Please input number 2 Div");
		int div2 = scan.nextInt();
		
		int div3 = div1 * div2;
		
		System.out.println("Div - " + div3);
	
		
		System.out.println("Enter the first number");
		int number1= scan.nextInt();
		System.out.println("Enter the second number");
		int number2= scan.nextInt();
		
		System.out.println("Choose the mathematical operation(+,-,*,/)");
		String mathOperator = scan.next();
		
		int result;
		
		switch(mathOperator) {
		
		case "+" : result= number1 + number2;
		System.out.println("The sum of two numbers is : " + result);
		break;
		
		case "-" : result= number1 - number2;
		System.out.println("The sub of two numbers is : " + result);
		break;
		
		case "*" : result= number1 + number2;
		System.out.println("The multiplication of two numbers is : " + result);
		break;
		
		case "/" : result= number1 + number2;
		System.out.println("The Division of two numbers is : " + result);
		break;
		
		default: System.out.println("invalid mathoperator");
		break;
		
		}
		
	}

}
