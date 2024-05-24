package Day20_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic_2_Types_Of_Exceptions {

	//CompileTime Exception - Checked Exception


		//RunTime Exception - Unchecked Exception


		public static void main(String[] args) {
			nullCheck();
			//divideByZero();
		}


		public static void checkingAFileIsPresentOrNot() {

				try {
					FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Login.txt");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

		}

		public static void divideByZero() {
			int a=100, b=0, c;
			c = a/b;
			System.out.println(c);
		}

		public static void nullCheck() {
			String name = null;
			System.out.println(name.length());
		}

	}
