package Day17_this_keyword;

public class Use3 {
	//3.this() can be used to invoke current in a method call
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use3 use3 = new Use3();
		Use3 usee3 = new Use3(10);
	}
	
	public Use3() {
		System.out.println("This is constructor and I am trying to get the value from inside");
	}

	public Use3(int i) {
		this();
		System.out.println("Parameterized constructor");
		//this(); -- //Constructor call must be first statement in a constructor
		
	}
	
}
