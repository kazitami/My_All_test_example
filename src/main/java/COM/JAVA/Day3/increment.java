package COM.JAVA.Day3;

public class increment {

	public static void main(String[] args) {
			
			
		//increment_value();
		decrement_value();
			

	}
	public static void increment_value() {
		System.out.println();
		int a = 100;
		int b = a++;// 101
		System.out.println("latest a's value 1" + a);// 101
		System.out.println("latest b's value 1" + b);//100
		System.out.println("-------------------------");
		int c = ++a + a++ + b++;
				//102 + 102 + 100
		System.out.println("latest a's value 2 " + a);//103
		System.out.println("latest b's value 2 " + b);//101
		System.out.println("latest c's value 2 " + c);//304
		System.out.println("-------------------------");
		//102 + 102 +  101 = 305 
		int d = c++ + a++ + ++b;
			//  c's value is 305
			//  a 's value is 104
			// b's value is 102
			// 304 + 103 + 102 = 509 
		System.out.println("latest a's value 3 " + a);//104
		System.out.println("latest b's value 3 " + b);//102
		System.out.println("latest c's value 3 " + c);//305
		System.out.println("latest d's value 4 " + d);//509
		System.out.println("-------------------------");
	}
	public static void decrement_value() {
		int a = 1;
		System.out.println("a value is = " + a);// 1
		int b = a--; //latest value of a is 1
		System.out.println("value of (b =a--) = " + b);
		int c = --a + a-- + b--;
			//position of a value is -1 +  
			// latest value of a is -2
			//position of b value is 1	= 1 
			//value of c is -1 + -1 + 1 = -1
		System.out.println("value of --a ="+ a);
		System.out.println("value of a-- ="+ a);
		System.out.println("value of b-- ="+ b);
		System.out.println("value of c = -1 + -1 + 1 = "+ c);
		System.out.println("-------------------------");
		
				// value of --a = -2
				// value of a-- = -2
				// value of b-- = 0
				// value of c = -1 + -1 + 1 = -1
		
		
			//	-1 + -1 + -1 = -3
		int d = c-- - a-- + --b;
		 	//  -2  -2  + -1 = 
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
