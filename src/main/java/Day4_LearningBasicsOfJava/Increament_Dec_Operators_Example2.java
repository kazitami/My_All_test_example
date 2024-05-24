package Day4_LearningBasicsOfJava;

public class Increament_Dec_Operators_Example2 {

	public static void main(String[] args) {
		int i = 1;
		
		i++; //latest value of i is 2. That means i will be evluated with the latest value
		
		int j = i++ + i++ + i++;
		
		// j = 2    +  3  +  4 = 9  
		// i = 3,    4,      5  
		
		
		
		//what is the latest value of i
		//what is the value of j
		
		System.out.println("i is : " + i); //5
		System.out.println("j is : " + j); //9


	}

}
