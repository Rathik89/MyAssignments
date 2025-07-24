package week4.homeassign;

public class LoginPage extends BasePAge{
	
	public void performCommonTasks() {
		System.out.println("This method performs the tasks from LoginPage class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage l = new LoginPage();
		l.performCommonTasks();
		l.clickElement();
		l.findElement();
		
		
		
	}

}
