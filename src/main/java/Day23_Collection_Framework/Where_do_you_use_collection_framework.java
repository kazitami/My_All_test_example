package Day23_Collection_Framework;

public class Where_do_you_use_collection_framework {
//	Where do you use Collection in your Automation Framework?
//
//			Answer:
//
//			1) Map: Map stores the data in Key and value format.
//
//			In automation Testing map can be used to pass the user data value for login page or for registration Page
//
//			For Example, we are passing the user details like name, e-mail, contact no etc in data table in feature file, while using BDD Approach.
//			Then in step-definition file we must convert data table in to Map and we can retrieve the values from the map.
//
//			2) Set : Duplicates are not allowed in the set. So it will store only unique element. Mainly used for Searching Operation.
//
//			The most common use of Set Interface is to handle all opened windows which are the child windows by web driver. To handle we use getWindowHandles( ) method which return the Set of String. By iterating through this set, we can identify and store the handles of all currently open windows.
//
//			// getWindowHandle method to get ID of new window (child window)
//			Set<String> Child_id = driver.getWindowHandles();
//
//			// for each loop
//			for (String a : Child_id)
//			{
//			// it will print IDs of both window
//			System.out.println(a);
//			}
//
//
//			3) List : List is used when we want to represent a group of individual objects as a single entity, where duplicates are allowed and insertion order must be preserved.
//
//			Finding all the links and finding all the requested tags are common examples where we can use List Interface.
//
//			List Interface in Automation Testing is used with findelements() methods. findelements() methods return the list of Webelemenets.
//
//			List<WebElement> plants = driver.findElements(By.tagName("li"));
//			for (WebElement element : elements)
//			{
//			System.out.println("Paragraph text:" + element.getText());
//			}
//
//			4) Queue: Queue Interface is used when we want to do some kind of operation in FIFO form, Like Sending a message to 10 Persons as per the sheet order.
//			Example:
//			a) When we want to send the mail to all Tester’s mailid available in excel sheet.
//			b) When we want to update the excel sheet data cell-wise.
}
