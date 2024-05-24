package Day22_Strings;

public class practice_Strings_Methods_part1 {

	
	public static void main(String[] args) {
		//Length 
		System.out.println("Length()");
		int [] l_Length = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Result of Length Methods gets the Length of the variable:"+ l_Length.length);
		System.out.println();
		//null
		//String n_Null=null;
		//System.out.println("Variable value is null "+ s0.length());
		
		//isEmpty() - this methods return boolean type
		
		System.out.println("isEmpty()");
		String s_isEmpty = "";
		System.out.println("Result of isEmpty methods is: " + s_isEmpty.isEmpty());
		System.out.println();
		
		//trim() - this methods removes the blank spaces before and after the String.
		//and return type of trim() methods is String
		System.out.println("trim()");
		String s_trim = "   Good Luck    ";
		System.out.println("Total length of the string for trim is :" + s_trim.length());
		System.out.println("After using trim methods : " + s_trim.trim());
		String After_trim = s_trim.trim();
		System.out.println("After using trim() method the length of string is: " + After_trim.length());
		System.out.println();

		//using trim() and lenth() together - s_trim.length(); if used together because 
		//length () returns int , this will also return int
		String h_trim = "     Hello World Hi     ";
		System.out.println(h_trim);
		System.out.println("Total length of Hello World Hi is: " + h_trim.length());
		int val = h_trim.trim().length();
		System.out.println("After trimming the Hello World Hi is :" + val );
		System.out.println();

		//compare two string using equals(), equalsIgnoreCase(), 
		//compareTo(), compareToIgnoreCase()
		
		//equals
		String s_equals1 = "Python";
		String s_String2 = "Java";
		System.out.println("is Python and Jave equal using equals()? -- " + s_equals1.equals(s_String2));
		System.out.println();

		
		System.out.println("is Python and Jave  using equalsIgnoreCase() ? -- " + s_equals1.equalsIgnoreCase(s_String2));
		System.out.println();
		
		//compareTo()
		String s_compareTo1 = "I am learning Java and Selenium";
		String s_compareTo2 = "I am learning Python and Selenium";
		
		
		System.out.println("I am learning Java and Selenium");
		System.out.println("I am learning Python and Selenium");
		System.out.println("getting the difference using compareTo() " + s_compareTo1.compareTo(s_compareTo2));
		System.out.println();
		
		String unicode1 = "a";
		String unicode2 = "A";
		
		//compareTo
		System.out.println("getting the difference of 'a' and 'A' using compareTo() -- " + unicode1.compareTo(unicode2));
		
		//compareToIgnoreCase
		System.out.println("getting the difference of 'a' and 'A' using compareToIgnoreCase() -- " + unicode1.compareToIgnoreCase(unicode2));
		System.out.println();
		
		//compareTo
		String S13 = "Q";
		System.out.println(S13);
		String S14 = "r";
		System.out.println(S14);
		
		System.out.println("getting the difference of ASCII value 'Q' and 'r' using compareTo() method " + S13.compareTo(S14));
		System.out.println();
		
		//compareToIgnoreCase
		System.out.println("getting the difference of ASCII 'Q' and 'r' using compareToIgnoreCase() method " + S13.compareToIgnoreCase(S14));
		System.out.println();
		
		//add/concat() Strings
		String concat1 = "Chicken";
		String concat2 = "Duck";
		String concat3 = concat1 + concat2;
		System.out.println("concating/Adding  Chicken and Duck together by using '+' sign : " + concat3);
		System.out.println();
		
		String concat4 ="Turkey";
		String concat5 = concat3.concat(concat4);
		System.out.println("Adding Chicken and Duck and Turkey together by using concat(): " + concat5);
		System.out.println();
		
		//join
		String join_string = String.join("-","BMW","TOYOTA","NISSAN","LEXUS");
		System.out.println("Example of join string " + join_string);
		
		
	}

}
