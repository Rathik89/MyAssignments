package week4.homeassign;

public class LoginPage extends BasePAge{
	
	public void performCommonTasks() {
		System.out.println("This method performs the tasks from LoginPage class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasePAge b = new BasePAge();
		b.performCommonTasks();
		b.clickElement();
		b.findElement();
	}

}
