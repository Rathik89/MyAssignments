package week4.day1;

public class LearnOverloading {

	/*
	 * Overloading:the method signautre is same but different input parameters 
	 */
	
	public void add() {
		int a=10;
		int b=5;
		System.out.println(a+b);
	}
	
	public void add(int a,int b,String name) {
	System.out.println(a+b+name);
	}
	public void add(int a,int b,float c) {
		System.out.println(a+b-c);
		}
	public static void main(String[] args) {
		LearnOverloading lo=new LearnOverloading();
		lo.add(5, 6, 10);
	}

}
