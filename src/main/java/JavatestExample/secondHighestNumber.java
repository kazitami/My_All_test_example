package JavatestExample;

import java.util.Arrays;

public class secondHighestNumber {

	public static void main(String[] args) {
		int[] arr = {1,4,5,7,6,9};
		Arrays.sort(arr);
		System.out.print("The second highest number is : "+ arr[arr.length-2]);
	}

}
