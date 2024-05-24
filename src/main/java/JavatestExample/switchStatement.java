package JavatestExample;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy;

public class switchStatement {

	public static void main(String[] args) {
		
		//browser is Chrome
		String browser = "Chrome";
		String verifyBrowser = "";
		switch(browser) {
		case "Chrome": verifyBrowser="Chrome";
						System.out.println("Browser is " + verifyBrowser);
						break;
		case "Firefox": verifyBrowser="Firefox";
		System.out.println("Browser is " + verifyBrowser);
		break;
		
		case "Edge": verifyBrowser="Edge";
		System.out.println("Browser is " + verifyBrowser);
		break;

		case "Opera": verifyBrowser="Opera";
		System.out.println("Browser is " + verifyBrowser);
		break;

		default:System.out.println("Invalid Browser");
		break;
		}
		
		//variable value is 7
		int a=7;
		switch(a)
		{
		case 1: System.out.println("One");
				break;
		
		case 7: System.out.println("Seven");
				break;
		default:
			System.out.println("None");
			break;
		}
		
		
		
		// variable value is 20.
		int b=20;
		switch(b) {
		case 10: System.out.println("Ten");
		         break;
		case 20: System.out.println("Twenty");
        break;
        
		case 30: System.out.println("Thirty");
        break;
        
		case 40: System.out.println("Forty");
        break;
        
		case 50: System.out.println("Fifty");
        break;
        
        default:
        	System.out.println("None");
        	break;
		}
		
		int month=7;
		String verifyMonth="";
		
		switch(month) {
		case 1:verifyMonth="January";
				break;
		case 2:verifyMonth="February";
		break;
		
		case 3:verifyMonth="March";
		break;
		
		case 4:verifyMonth="April";
		break;
		
		case 5:verifyMonth="May";
		break;
		
		case 6:verifyMonth="June";
		break;
		
		case 7:verifyMonth="July";
		break;
		
		case 8:verifyMonth="August";
		break;
		
		case 9:verifyMonth="September";
		break;
		
		case 10:verifyMonth="October";
		break;
		
		case 11:verifyMonth="November";
		break;
		
		case 12:verifyMonth="December";
		break;
		
		default:
			System.out.println("Invalid Month");
		}
		System.out.println(verifyMonth);

	}

}
