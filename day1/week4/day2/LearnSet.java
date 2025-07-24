package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
	public static void main(String[] args) {
		String s="Google";
		String j=s.toLowerCase();
		char[] charArray=j.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		for (int i=0;i<charArray.length;i++)
		{
			unique.add(charArray[i]);
					
		}
		System.out.println("Unique valaues are"+unique);
	}
	
	

}
