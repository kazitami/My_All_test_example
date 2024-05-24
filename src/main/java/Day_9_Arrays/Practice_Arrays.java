package Day_9_Arrays;

public class Practice_Arrays {

	public static void main(String[] args) {
		One_Dimensional_Array();
		class_assignment1();
		Two_Dimensional_Array();
		//Data Structure(memory storage) and Algorithms(but and intelligent logic)
		//Arrays - It is a very straight forward concept
		//Arrays is a data-structure/object that contains homogeneous[same data type] elements 
		//All Arrays has similar data type
		//Length of the array is determined/decided at the time of creation and once created it remains fixed
		//indexing position starts from zero and if there are total n elements the elements the last element will be inside(n-1)th position
		
		//Array indexing is accessing an array element
		
		
		//Features of Arrays
		//1. indexing position starts from 0
		//2.any java array variable can be declared like other variables but the representational form is a dimendsion which is[]
		
		int a=30;// here a is simply a variable of int datatype
		int b[] = {10,20,30};// here b is an array variable of int type
		
		//3. all the variables in the array are ordered
		//4. since arrays are objects, they occupy memory space
		//5. parent class of Arrays is Object Class
		//6. arrays are always created at Runtime
		//7. you want to determine the length of an array- you have to use a member known as lenth
		
		//Advantages of Array
		//1. store multiple data items using a single name
		
		int c = 10;
		int c1[]= {10,20,30,40,50,60,70};//you can store multiple data
		
		//2.We can access any element ofthe array using the indexes.
		//3.Arrays can be used to implement other data structures such as LinkedLists, Stacks, Queues, Graphs, Trees, etc.
		//4.Primitive data types conversion to Wrapper Class Object will not happen in case of arrays. Hence they are faster in operation
		
		
		//Disadvantages of Array
		//1. Fixed size
		//2. memory wastage
		//3. Strongly typed - which is pre-defined.
		//4.Arrays do not have any kind of add or remove methods
		
		//What kind of Arrays
		//1-D array
		//2-D array
		//3-D array
		//Jagged array
		//Object array
		
		
	}
	public static void How_to_Learn_Arrays() {
		//1.Declaretion of Arrays
		//2.Create  an Array
		//3.Initialize as Array
		//4.Retrive elements of the Array
		
	}
	public static void One_Dimensional_Array() {
		//1.Declaretion of Arrays
		int a[];// this one is the most popular way of declaring an array
		int[] a1;
		int[]a2;
		
		int[] b1,c1;// b1 is 1-D array, c1 is also 1-D array.
		int b2[],c2;//b2 is 1-D array, c2 is just an  integer type variable.
		int b3,c3[];// b3 is just an int varaiable, c3 is 1-D array
		int [] b4, c4[]; //b4 is 1-D, c4 is 2-D array
		
		//Creation of Arrays
		//we use the reserved keyword new
		
		
		//Creation and initialization
		int a3[]  = new int[3];// int 3 is size of the array
		int b[] = new int[5];
		
		System.out.println("the length of array a3 is :"+ a3.length);
		System.out.println("the lenth of arrya b is: " + b.length);
		
		//b has 5 elements
		//indexing position starts from 0 and in this case it will end in 4th position
		
		
//		int d[] = new int[5];
//		d[0]=111;
//		d[1]=222;
//		d[2]=333;
//		d[3]=444;
//		d[4]=555;
		
		
		//declaration, creation and initialization
		int d[]= {111,222,333,444,555};
		
		System.out.println("The length of array d is: " + d.length);
		
		
		//2.Create  an Array
		//3.Initialize as Array
		//4.Retrieve elements of the Array
		//1-D[]
		
	}
	public static void class_assignment1() {
		//Make an int array with 20 elements in it
		int FirstArray[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("First Array value:");
		for(int i=0;i<FirstArray.length;i++)
		{
			System.out.print(" " + FirstArray[i]);
		}
		System.out.println();
		//------------------------------------
		
		//Make a decimal array with 10 elements in it 
		double SecondArray[] = {1.2,2.3,3.4,5.6,7.6,7.8,5.6,8.9,5.9,9.8};
		
		System.out.println("Second Array value:");
		for(int i=0;i<SecondArray.length;i++)
		{
			System.out.print(" " + SecondArray[i]);
		}
		System.out.println();
		//------------------------------------
		
		//Make a String array with 5 elements in it
		String ThirdArray[]= {"Hello","Hi","How","Are","You"};
		
		System.out.println("Third Array value:");
		for(int i=0;i<ThirdArray.length;i++)
		{
			System.out.print(" " + ThirdArray[i]);
		}
		System.out.println();
		//------------------------------------
		
		//Use for loop to retrieve all the elements of each array mentioned above  
		
		//Retrieve the 20th element of 1st array
		System.out.println("20th element of 1st array is : " + FirstArray[19]);
		//Retrieve the 11th element of 2nd array
		//System.out.print("11th element of 2nd array is : " + SecondArray[10]);
		
		//Retrieve the 1st element of 3rd array
		System.out.println("20th element of 1st array is : " + ThirdArray[0]);
	}
	public static void Two_Dimensional_Array() {
		//[] - One Dimension
		//[][] - Two Dimension
		
		
		//Declaration of two dimensional Array
		int[][] a1;
		int a2[][];
		int[][]a3;
		int [][]a4;
		int[]a5[];
		int a6[][];
		
		int[][]b1,c1; // both are 2-D
		int [] b2[],c2;//  b2 is 2-D, c2 is 1-D
		int[] b3[], c3[];//b3 is 2-D, c3 is 2-D
		int[][]b4,c4[];//b4 is 2-D, c4 is 3-D
		int[]b5[],c5[];//b5 id 2-D, c5 is 2-D
		//int[][]b6,[]c6;//this is wrong representation
		
		int[][] b = {{11,22,33,34},
				{44,55,66,67},
				{77,88,99,100}};
		System.out.println("Value of Two Dimensional Array:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	
		
	}

}
