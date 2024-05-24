package Day20_Exception_Handling;

public class Topic_6_Print_Information {
	public static void main(String[] args) {
		int a=100,b=0,c;
		
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();//prints ExceptionName, ExceptionDescription, and also stack trace
			System.out.print(e);//prints ExceptionName, ExceptionDescription
			//System.out.println(e.toString());//prints ExceptionName, ExceptionDescription
			//System.out.println(e.getMessage());
		
		}
	}
}
