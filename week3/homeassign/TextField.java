package week3.homeassign;

public class TextField extends WebElement{

	
public void getText()
{
	System.out.println(" The Text is published");
}
public static void main(String[] args) {
	
	TextField field = new TextField();
	field.click();
	field.setText();
	field.getText();

}



}


