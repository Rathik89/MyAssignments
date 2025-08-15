package week3.homeassign;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
	String text1 ="stops";
		
	String text2 ="potss";
			
			if(text1.length()== text2.length() ) {
				
				char[] t1= text1.toCharArray();
				char[] t2=text2.toCharArray();
				Arrays.sort(t2);
				Arrays.sort(t1);
				
				if(Arrays.compare(t1, t2)==0)
				{
					System.out.println("It is Anagram");
				}
			else {
				System.out.println("It is not Anagram");
			}
				
			
			}	

	}

}
