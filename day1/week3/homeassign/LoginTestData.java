package week3.homeassign;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("USername is enetered--> Login test data class ");
	}
	
	public void enterPassword() {
		System.out.println("PWD is entered-->Login test data class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData ld = new LoginTestData();
		ld.EnterCredentials();
		ld.navigateToHomePage();
		ld.enterUsername();
		ld.enterPassword();
	}

}
