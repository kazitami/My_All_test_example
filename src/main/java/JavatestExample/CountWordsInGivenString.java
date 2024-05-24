package JavatestExample;

public class CountWordsInGivenString {

	public static void main(String[] args) {
		String MyWords = "Hello, how are you doing today?";
		System.out.println(MyWords);
		
		int count=0;
		for(int i=0; i<MyWords.length();i++) {
			if(MyWords.charAt(i)==' ' && MyWords.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
