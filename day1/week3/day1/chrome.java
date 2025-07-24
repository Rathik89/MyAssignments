package week3.day1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class chrome extends Browser {

	public void openicognito() {
		System.out.println(" The browser is opened in incognito mode-->Chrome class");
	}
	
	public void clearCache() {
		
		System.out.println(" The cache is cleared");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		chrome c = new chrome();
		c.OpenURL();
		c.navigateBack();
		c.closeBrowser();
		c.openicognito();
		c.clearCache();
		c.browsername= " Hello welcome to Inheritance concept ";
				System.out.println(c.browsername);

	}

}
