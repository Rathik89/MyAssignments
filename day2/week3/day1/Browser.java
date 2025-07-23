package week3.day1;

public class Browser {
	
	String browsername;
	String Browserversion;
	
	
	public static void OpenURL() {
		System.out.println("The URL is opened-->Browser Superclass  ");
		
	}
	
public static void closeBrowser() {
	System.out.println(" The Browser is closed-->Browser Superclass ");
}
public static void navigateBack() {
	
	System.out.println(" The page is navigated to back page-->Browser Superclass ");
}

public static void main(String[] args) {
	
	Browser b= new Browser();
	b.OpenURL();
	b.closeBrowser();
	b.navigateBack();
}
}
