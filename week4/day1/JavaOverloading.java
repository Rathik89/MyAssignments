package week4.day1;

public class JavaOverloading {
	
	public void reportStep(String msg,String status) {
		
		System.out.println("The message is " +msg);
		System.out.println("The status is " +status );
	}

	public void reportStep(String msg,String status,boolean snap) {
		
		System.out.println("The message is " +msg);
		System.out.println("The status is " +status );
		System.out.println(" The snap is " + snap);
	}
	
	public static void main(String[] args) {
		JavaOverloading j = new JavaOverloading ();
		j.reportStep("Hello", "Passed");
		j.reportStep("Hi", "Failed", false);
				
	}
}


