package JavatestExample;

public class bubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		int lentghOfArray = arr.length;
		
		System.out.print("Unsorted array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<lentghOfArray;i++) {
			for(int j=1;j<lentghOfArray-i;j++) {
				if(arr[j-1]> arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted array: ");
		for(int i=0; i<lentghOfArray;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
