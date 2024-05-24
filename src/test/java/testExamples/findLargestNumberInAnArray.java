package testExamples;

public class findLargestNumberInAnArray {

	public static void main(String[] args) {
		//find largest number in an integer array
		
		int[]arr = {10,20,30,50,40,70,100,90};
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
