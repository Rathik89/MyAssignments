package week3.homeassign;

public class Button extends WebElement {

	public void submit()
	{
		System.out.println(" Button is submmitted ");
	}
			
			public static void main(String[] args)
			{
				Button b =new Button();
				b.click();
				b.setText();
				b.submit();
			}
}
