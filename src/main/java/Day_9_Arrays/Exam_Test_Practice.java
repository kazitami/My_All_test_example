package Day_9_Arrays;

public class Exam_Test_Practice {

	public static void main(String[] args) {
		//Question 6: 
			String[][] S1 = { { "Amit", "Dear", "Lion", "Cat" }, 
					       { "Anil", "Monkey", "Panther", "Cheetah" },
					       { "Dorrethy", "Gravy", "Shirt", "Mouse" }};
		//How will you retrieve all the elements of the above array?
		//How will you determine the length of this array?
				
		for (int i = 0; i<=S1.length-1; i++) {
			for (int j = 0; j<=S1[i].length-1; j++) {
				System.out.print(S1[i][j] + " ");
			}
			System.out.println();
		}	
		System.out.println(S1.length);
		
	}

}
