package Day7_Control_Statement_in_java;

public class ForLoop_insideWhileLoop {

	public static void main(String[] args) {

		int a = 1;
		while (a <2) { //True

			for (int j = 1; j <=10; j++) {
				System.out.println(j+" -- "+ (23 + 37)); //60
				
				
			}

			System.out.println("This is while loop body");
			break;

		}
		
		System.out.println();
		System.out.println("The while loop body will not be executed because condition is false in the while loop iteself");

	}

	}
