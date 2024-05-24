package JavatestExample;

public class threadExampleWithExtendingThreadClass extends Thread {

	public static void main(String[] args) {
		threadExampleWithExtendingThreadClass obj = new threadExampleWithExtendingThreadClass();
		obj.start();

	}
	public void run() {
	System.out.print("thread is running with extending thread class");	
	}
}
