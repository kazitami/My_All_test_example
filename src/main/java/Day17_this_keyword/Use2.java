package Day17_this_keyword;

public class Use2 {

	//2. can be used to invoke current class method(implicitly)
	
	public static void main(String[] args) {
		Use2 use2 = new Use2();
		use2.show();
 
	}
	
	void diaplay() {
		System.out.println("Hello World");
	}
	
	void show() {
		this.diaplay();
	}

}
