package week3.homeassign;

public class JavaConnection extends MySqlConnection implements  DatabaseConnection  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConnection jc= new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		
}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
	}

}
