package COM.JAVA.Day3;

public class weeklyTest1 {

	public static void main(String[] args) {
		concatanation_value();
		comparing_values();
		sum_value();
		increment_value();
		decrement_value();
		leap_year();	
	}
	//-----------------------------------------
	public static void sum_value() {
		int a3 = 10;
		int b3 =20;
		int c = a3+b3;
		System.out.println("Sum of a and b is : "+ c);
		
	}
	//-----------------------------------------
	public static void comparing_values() {
		int a1 = 10;
		int b1 = 20;
			System.out.println(a1 == b1);
			//false
			System.out.println(a1 != b1);
			//true
			System.out.println(a1 <= b1);
			//true 
			System.out.println(a1 >= b1);
			//false right
	}
	//-----------------------------------------
	public static void concatanation_value() {
		int a = 10;
		int b = 20;
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(a+b+s1+s2);
				//30HelloWorld
		System.out.println(s1+s2+a+b);
				//HelloWorld1020 wrong
		System.out.println();
		
	}
	//-----------------------------------------
	public static void increment_value() {
		System.out.println();
		int a = 100;
		int b = a++;// 101
		System.out.println("latest a's value " + a);
		System.out.println("latest b's value " + b);
		
		int c = ++a + a++ + b++;
		//102 + 102 +  101 = 305 
		int d = c++ + a++ + ++b;
			   // 305 + 102 + 102 = 509
		System.out.println(a);// latest value of a is 104
		System.out.println(b);//latest value of b is 102
		System.out.println(c);//latest value of c is 305
		System.out.println(d);//latest value of a is 509
		System.out.println();
	}
	//-----------------------------------------
	public static void decrement_value() {
		 	int a = 1;
			int b = a--; //0
			int c = --a + a-- + b--;
				//	-1 + -1 + -1 = -3
			int d = c-- - a-- + --b;
			 	//  -2  -2  + -1 = 
			System.out.println(a); 
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
	}
	//  -----------------------------------------
	public static void leap_year() {
		for (int i=1996;i <2025; i=i+4)
		{
			if(i % 4 ==0)
			{
				System.out.println("Leap year " + i);
				System.out.println();
			}else
			{
				System.out.println("Not Leap Year " + i);
				System.out.println();
			}
			
		}
	}
	

}
