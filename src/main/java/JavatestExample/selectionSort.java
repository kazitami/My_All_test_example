package JavatestExample;
import org.checkerframework.checker.units.qual.min;

public class selectionSort {

	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22,11};
		int arrOfLength = arr.length;
		System.out.print("Selection unsorted array -> ");
		for(int i=0;i<arrOfLength;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<arrOfLength-1;i++) {
			int min_index = i;
			for(int j=i+1;j<arrOfLength;j++)
			{
				if(arr[min_index]> arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		System.out.println();
		System.out.print("Selection sorted array -> ");
		for(int i=0;i<arrOfLength;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
