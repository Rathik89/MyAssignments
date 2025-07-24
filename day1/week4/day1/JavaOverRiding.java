package week4.day1;

public class JavaOverRiding extends JavaOverloading {
	
	public void reportStep(String msg,String status) {
		
		System.out.println("The message is " +msg);
		System.out.println("The status is " +status );
	}
	 
	public static void main(String[] args) {
		
		JavaOverRiding or =new JavaOverRiding();
		or.reportStep("Welcome", "Passed");
		
	}
}
