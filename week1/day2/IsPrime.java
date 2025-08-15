package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		int i=2;
		boolean isPrime=true;
		
		while (i<n)
		{
			if(n%i==0)
				
			isPrime=false;
			i++;
		}
		if(isPrime)
			
			System.out.println("The given no is Prime");
		else
			System.out.println(" The given no is not Prime");
		
	}

}
