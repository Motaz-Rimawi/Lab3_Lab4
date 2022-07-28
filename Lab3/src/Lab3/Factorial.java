package Lab3;

public class Factorial {
	public static void main(String[] args) {
		int val = (int)(Math.random()*7) + 1 ;
		
		System.out.println("Value equals: " + val);
		
		System.out.println("The factorial for value "+ val+" is: " + fac(val));
	}
	
	public static int fac (int n) {
		if (n==0 || n==1)
			return 1;
		else
			return n * fac(n-1) ; 			
	}
}
