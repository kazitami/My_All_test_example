package Day7_Control_Statement_in_java;

public class do_while_loop {

	public static void main(String[] args) {
		do_while_example1();
		do_while_example2();
		do_while_example_3();
		print_HelloWorld();
		}
		
		public static void do_while_example1() {
			
			int i=0;
			do {
				//body of the do block
				//first the do body will be executed.
				//then it will check for the while condition
				//it the while condition is true then again the do block will execute
				//if the while condition is false then do block will not execute
			
				i++;
				System.out.println(i);
			
				
			}
			while(i<100);
			
			System.out.println("-----------------------");
			
		}
	
		public static void do_while_example2() {
			int s = 0;
			do {
				s++;
				System.out.println("Hello " + s);
			}
			while(s<10);
		}
		public static void do_while_example_3() {
			System.out.println("---------");
			String a="tom";
			String greets = "Hello,How are you? Count 1 to 10";
			do {
				System.out.println(greets);
				break;
			}
			while(a=="tom");
			line(greets);
			int i=0;
			do {
				i++;
				System.out.println(i);
			}
			while(i<10);
		}
		public static void line(String value) {
			//String value="Hello,How are you? Count 1 to 10";
			for(int j=0;j<=value.length();j++)
			{
				//System.out.println();
				System.out.print("-");
			}
			System.out.println();
		}
		//Print HelloWorld 1000 times
		public static void print_HelloWorld()
		{
			int i=0;
			do {
				
				System.out.println(i+ "HelloWorld");
				i++;
			}
			while(i<=1000);
		}
	}


