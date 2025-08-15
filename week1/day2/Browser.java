package week1.day2;

public class Browser {

	public String launchBrowser(String BrowserName) {
		
		return BrowserName;
	}
	
	public void browserName ()
	{
		System.out.println("Application URL loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser br =new Browser();
	
		System.out.println("Browser Launched successfully " +br.launchBrowser("Chrome"));
		br.browserName();

	}

}
