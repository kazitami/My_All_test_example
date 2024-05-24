package JavatestExample;

public class CountWords {

	public static void main(String[] args) {
		String myWords = "Hello, how are you doing?";
		int count = 0;
		for (int i=0;i<myWords.length();i++) {
			if(myWords.charAt(i) ==' ') {
				count++;
			}
		}
		//
		System.out.println("The number of words are -> " + (count+1));

	}

}
