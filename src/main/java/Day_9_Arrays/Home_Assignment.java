package Day_9_Arrays;

public class Home_Assignment {

	public static void main(String[] args) {	

			//Jagged array
			//Jagged array - every column can be different size;
			//jagged array can save memory.you can use memory you need.
			//What is a Jagged Array
			//Write some basic code related to Jagged Array
		
			//declaration of jagged Array
			int[][] jaggedArray = {{10,20,30},
								  {40,50,60,70,80,90},
								  {110,115}};
			
			for(int i=0;i<jaggedArray.length;i++) {
			
				for(int j=0;j<jaggedArray[i].length;j++)
				{
					System.out.print("[" + jaggedArray[i][j] + "] ");
					
				}
				System.out.println();
			}
			System.out.println("-----------");
			//creating a jagged array by getting the i nput from the user
			//enter the number of rows for the array
			
		
			
		    //Object array
			//in object array we can put all types of data.
				Object[] arr = {"helloworld", 12, 1.2, 'c'};
				
				for (int i = 0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
			
	}
}

