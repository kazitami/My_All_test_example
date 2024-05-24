package Day22_Strings;

public class StringHomeWork {

		public static void main(String[] args) {
			
				//subsequence()
			 	String str = "ABCD";

		        // Create a subsequence of the string from index 1 to index 3
		        CharSequence subsequence = str.subSequence(1, 3);

		        // Print the subsequence
		        System.out.println("subsequence - ABCD - " + subsequence); // Output: BCD
		        
		        
				//replace()
		        String myStr = "Hello";
		        System.out.println("replace - Hello" + myStr.replace('l', 'p'));
		        
		        //repaceAll()
		        String myStr1 = "Hello";
		        System.out.println("replaceAll - Hello " + myStr1.replaceAll(myStr1, "p"));
				

				//String Searching category
		        
				//indexOf()
		        String myIndexOf = "Hello planet earth, you are a great planet.";
		        System.out.println("indexOf - " + myIndexOf.indexOf("planet"));
				
		        //lastIndexOf()
		        String myLastIndexOf = "Hello planet earth, you are a great planet.";
		        System.out.println("lastIndexOf - " + myLastIndexOf.lastIndexOf("g"));
				
				//contains()
		        String strContains="what do you know about me";  
		        System.out.println("contains() - " + strContains.contains("do you know"));  
		        System.out.println("contains() - " + strContains.contains("about"));  
		        System.out.println("contains() - " + strContains.contains("hello"));  
				
		        //charAt()
		        String strCharAt = "Hello";
		        char result = strCharAt.charAt(0);
		        System.out.println("charAt - " + result);
		        
				//startsWith()
		        String StrStartsWith = "Hello, How are you?";
		        System.out.println("StartsWith - " + StrStartsWith.startsWith("Hello"));

		        //endsWith()
		        String StrEndsWith = "Hello, How are you?";
		        System.out.println("EndsWith - " + StrEndsWith.endsWith("Hello"));
		        System.out.println("EndsWith - " + StrEndsWith.endsWith("you"));

				//Case conversion methods
		        
				//toLowerCase()
		        String StrlowerCase = "ASDJFGHKDFJG";
		        System.out.println("toLowerCase - " + StrlowerCase.toLowerCase());
				
		        //toUpperCase()
		        String upperCase = "dfgsdfgsdfg";
		        System.out.println("toUpperCase - " + upperCase.toUpperCase());

				//Type conversion methods
				
		        //valueOf()
		        int numValueOf = 345;
		        String sample = String.valueOf(numValueOf);
		        System.out.println("valueOf - " + sample);
				
		        //toCharArray()
		        System.out.print("toCharArray - "); 
		        String s1="hello";  
		        char[] ch=s1.toCharArray();  
		        for(int i=0;i<ch.length;i++){  
		        System.out.print(ch[i]);  
		        }  
			}
		}


