package Day20_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic_9_Throws_keyword {//do not use throws with pre-defined exception

	public static void main(String[] args) throws FileNotFoundException {
		filePresentOrNot();

	}
	
	public static void filePresentOrNot() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\Users\\kazit\\OneDrive\\Desktop\\Collaborator\\MyFirstGitHub");
	}
	
	
}
