package week3.homeassign;

public class ReverseOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName ="I am a software tester";
		
		String array[]=companyName.split(" ");
		
		
				for(int i=0;i<array.length;i++){
			if(i%2!=0)
			{
char letters[]= array[i].toCharArray();

				for(int j=letters.length-1;j>=0;j--)
				{
					System.out.print(letters[j]);
				
				}
			}
			else {
								
				System.out.print(array[i]);
			}
			if(i<array.length-1) {
				System.out.print("");
			}
		}
	
		
	}
}
