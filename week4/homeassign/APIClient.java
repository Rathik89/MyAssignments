package week4.homeassign;

public class APIClient {
	

	public void SendRequest(String endpoint) {
		System.out.println(" The end point is establised"+endpoint);
	}

	public void SendRequest(String endpoint,String requestBody,Boolean RequestStatus ) {
		System.out.println(" The end point is establised"+endpoint);
		System.out.println(" The Request body is establised"+requestBody);
		System.out.println(" The Request status is "+RequestStatus);
		
			}
	
	public static void main(String[] args) {
		APIClient c= new APIClient();
		c.SendRequest("ChromeBrowser");
		c.SendRequest("ChromeBrowser", "Amazon", true);
	}
}