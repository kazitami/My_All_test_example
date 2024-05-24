package testExamples;

public class compareTwoString {
//how to compare two string
	public static void main(String[] args) {
	
		compareString("Hello","Hello");
	}

	public static void compareString(String s1,String s2) {
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
	
}
