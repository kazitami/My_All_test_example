package testExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@Test(dataProvider="getData")
	public void loginTest(String username, String password,String browser, int telephone ) {
		System.out.println(username +"---"+ password +"---"+browser+"---"+telephone);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][4];
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = "chrome";
		data[0][3] = 12233456;
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = "edge";
		data[1][3] = 345234523;
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = "firefox";
		data[2][3] = 23452345;
		
		return data;
		
		
	}

}
