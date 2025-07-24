package week3.day1;

public class safari extends Browser {
	
	public void readerMode()
	{
		System.out.println(" The browser is in reader mode -->Safariclass");
	}
	
	public void fullscreenMode() {
		
		System.out.println(" The browser is in full scrren mode -->SafariClass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		safari s= new safari();
		s.fullscreenMode();
		s.navigateBack();
		s.readerMode();
		s.OpenURL();
		s.closeBrowser();
		

	}

}
