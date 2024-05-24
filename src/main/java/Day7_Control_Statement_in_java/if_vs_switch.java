package Day7_Control_Statement_in_java;

public class if_vs_switch {
	public static void main(String[] args) {
		switch_month();
		switch_week();
		switch_leap_year();
	} 
	public static void smallet_number() {
		int a=1;
		int b=2;
		int c=3;
		switch(a) {
		case 1:System.out.println("");
		}
	}
	public static void switch_leap_year() {
		int year=2000;
		boolean leap_year;  
				
		switch(year) {
		case 2001:leap_year = year%4 == 0;
		//break;
		case 2002:leap_year = year%4 == 0;
		//break;
		default:
			System.out.println("This is not Leap Year");
		}
		System.out.println("Leap Year " + year);
	}
	
	public static void switch_week() {
		int day=4;
		String day_name = "";
		switch(day) {
		case 1:day_name = "Saturday";
		break;
		case 2:day_name = "Sunday";
		break;
		case 3:day_name = "Monday";
		break;
		case 4:day_name = "Tuesday";
		break;
		case 5:day_name = "Wednesday";
		break;
		case 6:day_name = "Thursday";
		break;
		case 7:day_name = "Friday";
		break;
		default:
			System.out.println("Invalid Week");
		}
		System.out.println(day_name);
	} 
	public static void switch_month() {
		//determine number 7 for month is July using if else or using Switch

				//Specifying month number  
			    int month=7;    
			    String monthString="";  
			    //Switch statement  
			    switch(month){    
			    //case statements within the switch block  
			    case 1: monthString="1 - January";  
			    break;    
			    case 2: monthString="2 - February";  
			    break;    
			    case 3: monthString="3 - March";  
			    break;    
			    case 4: monthString="4 - April";  
			    break;    
			    case 5: monthString="5 - May";  
			    break;    
			    case 6: monthString="6 - June";  
			    break;    
			    case 7: monthString="7 - July";  
			    break;    
			    case 8: monthString="8 - August";  
			    break;    
			    case 9: monthString="9 - September";  
			    break;    
			    case 10: monthString="10 - October";  
			    break;    
			    case 11: monthString="11 - November";  
			    break;    
			    case 12: monthString="12 - December";  
			    break;    
			    default:System.out.println("Invalid Month!");    
			    }    
			    //Printing month of the given number  
			    System.out.println(monthString);  
	}
}
