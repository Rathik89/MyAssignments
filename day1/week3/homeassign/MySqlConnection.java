package week3.homeassign;

public abstract class MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		System.out.println(" The connection is extablished ");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
		System.out.println(" Teh connection si disconnected ");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
		System.out.println(" Executing the update process ");
		
	}
public void executeQuery() {
		
		System.out.println("This method is to execute a query ------ MySqlConnection Subclass");
	}

	public static void main(String[] args) {
		
		

	}

}
