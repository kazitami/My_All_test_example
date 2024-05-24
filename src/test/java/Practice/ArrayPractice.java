package Practice;

import testExamples.selectDropdown;

public class ArrayPractice {

	public static void main(String[] args) {
		//1st array - Make an int array with 20 elements in it

		//2nd array - Make a decimal array with 10 elements in it

		//3rd array - Make a String array with 5 elements in it

		//Use for loop to retrieve all the elements of each array mentioned above
		//Retrieve the 20th element of 1st array
		//Retrieve the 11th element of 2nd array
		//Retrieve the 1st element of 3rd array 
		
		
		int[] FirstArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		    System.out.println("First Array value ");
			for(int i=0;i<FirstArray.length;i++) {
				System.out.print(FirstArray[i]+ " ");
			}
			System.out.println();
			System.out.println("20th element of First Array is - " + FirstArray[19]);
			System.out.println("********************************************************");
			
			
		double[] SecondArray = {1.6,2.7,3.2,4.3,5.7,6.3,7.4,8.6,9.4,10.2};
		System.out.println("Second Array value ");		
		for(int i=0;i<SecondArray.length;i++) {
					System.out.println(SecondArray[i]);
				}
		System.out.println();
		
		try {
			System.out.println("11th element of Second Array is - " + SecondArray[10]);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		System.out.println("********************************************************");
		
		
		String[] ThirdArray = {"How","Are","You","Doing","Today"};
		System.out.println("Third Array value ");		
		for(int i=0;i<ThirdArray.length;i++) {
			System.out.println(ThirdArray[i]);
		}
		System.out.println();
		System.out.println("1 st  element of Third Array is - " + ThirdArray[0]);
		System.out.println("********************************************************");
		
		//-----------------------------------------------------------------------
		System.out.println("Two Dimensional Array");
		int [][]b = {{11,22,33,44},{22,33,44,55},{23,45,67,78}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(b[i] [j]);
			}
		}
		System.out.println("********************************************************");
		
		System.out.println("Object Array Example");
		System.out.println("-----------------------------------------------------");
		Object[] arr = {12,1.3,"Hello",'c',true};
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("********************************************************");
		
	}

}
