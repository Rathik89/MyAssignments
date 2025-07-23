package week3.day1;

public class Edge extends Browser {
	
	public void takesnap() {
		System.out.println("Tske a snapclass--> Edge class");
	}
	
	public void clearCookies() {
		
		System.out.println("Cookies are cleared -->Edge class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge e =new Edge();
		System.out.println("IT is Edge Browser " +e.browsername);
		e.OpenURL();
		e.clearCookies();
		e.closeBrowser();
		e.takesnap();
		e.clearCookies();

	}
}

