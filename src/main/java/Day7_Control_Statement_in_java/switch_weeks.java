package Day7_Control_Statement_in_java;

public class switch_weeks {

	public static void main(String[] args) {
		int day= 4;
		String day_name = "";
		switch (day) {
		case 1: day_name = "Saturday";
			System.out.println(day_name);
			break;
		case 2: day_name = "Sunday";
			System.out.println(day_name);
			break;
		case 3: day_name = "Moday";
			System.out.println(day_name);
			break;
		case 4: day_name = "Tuesday";
			System.out.println(day_name);
			break;
		case 5: day_name = "Wednesday";
			System.out.println(day_name);
			break;
		case 6: day_name = "Thursday";
			System.out.println(day_name);
			break;
		case 7: day_name= "Friday";
			break;
		default: 
			System.out.println("Invalid Week");
		}
		//System.out.println(day_name);
		
		//--------------------------
		String subject = "English";
		switch(subject) {
		case "Bangla":System.out.println("Bangla");
		break;
		case "English":System.out.println("English");
		break;
		default:
			System.out.println("Math");
		}
		//--------------------------
		
		int Mark=70;
		String pass="";
		switch(Mark) {
		
		}
	}
		
//		public static void switch_week() {
//			int day=4;
//			String day_name = "";
//			switch(day) {
//			case 1:day_name = "Saturday";
//			break;
//			case 2:day_name = "Sunday";
//			break;
//			case 3:day_name = "Monday";
//			break;
//			case 4:day_name = "Tuesday";
//			break;
//			case 5:day_name = "Wednesday";
//			break;
//			case 6:day_name = "Thursday";
//			break;
//			case 7:day_name = "Friday";
//			break;
//			default:
//				System.out.println("Invalid Week");
//			}
//			System.out.println(day_name);
		
	}


