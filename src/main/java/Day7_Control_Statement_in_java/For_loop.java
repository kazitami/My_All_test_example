package Day7_Control_Statement_in_java;

public class For_loop {

	public static void main(String[] args) {
	
		for_1_to_5();
		System.out.println("");
		System.out.println("----------------------");
		reverse_for_10_to_1();
		System.out.println("");
		System.out.println("----------------------");
		even_number_with_for_loop();
		System.out.println("");
		System.out.println("----------------------");
		sum_of_50_numbers();
		System.out.println("");
		//--------------------------------------------------
		// what is looping statement ?
		//if the same block executes multiple number of times as per the logic

		//for(initialization ; condition ; increment/decrement) {
			     //body
		//  }

		//Logic sequencing of for loop

		//Step 1: initialization
		//Step 2: condition
		//Step 3: if condition is true, go inside the body of the for loop
		//Step 4: increment/decrement
		//Step 5: check for the condition again
		//--------------------------------------------------
		
	}
		//write a java code that prints 1 to 5
		public static void for_1_to_5(){
			System.out.println("Printing 1 to 5");
			
			for(int i=1; i<=5 ; i++) {
				System.out.print(i + " "); //1 2 3 4 5
			}
		}
	
		
		//Write a java program to print 10 to 1 in a reverse way 10 9 8 7..... 1
			public static void reverse_for_10_to_1() {
				System.out.println();
				for(int i=10 ; i>=1 ; i--) {
					System.out.print(i + " ");
					
				}
				//System.out.println("--------------------------------------");
			}
			
			
			//Write a java program to print first 10 even numbers
			//2....4....6.............................20
			public static void even_number_with_for_loop() {
				
				for(int i=1 ; i<=10 ; i++) {
					System.out.print(2*i + " ");

				}


				System.out.println("");
			}
			
			//write to print the first 50 natural numbers and print of the sum
			//of all the 50 natural numbers
			//1..........................................50
			//1 + 2 + 3 + 4+..................................+ 50 = sum
			public static void sum_of_50_numbers() {
				int sum = 0;
				for(int i=1 ; i<=50 ; i++) {
					System.out.print(i + " "); //1  2
					sum = sum + i; // 0 + 1 = 1,   sum = sum + i


				}
				System.out.println();
				System.out.println("the sum at this place is : " + sum);
			}
}