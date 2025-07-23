package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName ="TestLeaf";
		char nameArray[]=companyName.toCharArray();
		int length= companyName.length();
		for(int i=length-1;i>=0;i--)
		{
		System.out.println(nameArray[i]);
		
	}
	}
}