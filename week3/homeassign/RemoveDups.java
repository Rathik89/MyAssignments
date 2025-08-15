package week3.homeassign;

import java.util.Arrays;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="We learn Java basics as part of java sessions in java week1";
		
		String text1[]=text.split(" ");
		
	for(int i=0;i<text1.length;i++)
	{
		for(int j=0;j<text1.length;j++) {
			
			if(text1[i].equalsIgnoreCase(text1[j])) {
				text1[j]=" ";
				
						}
		}
		
	
		{
			System.out.print(text1[i]+ " " );
		}
		
	}
	
}
}