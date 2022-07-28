package Lab3;

public class Fibonacci {
	public static void main(String[] args) {
		int val = (int)(Math.random()*41) + 10 ; 
		int a1 = 1 , a2 = 1; 
		int fib = 0 ; 
		System.out.println("First 40 Fibonacci numbers :\n" + a1+ "\n" + a2 );
		for (int i = 0; i <40; i++) {
			fib = a1 + a2 ; 
			a1 = a2 ;
			a2 = fib ; 
			System.out.println(fib);
		}
		
		fib = 1;
		a1 = 1 ; a2 = 1; 

		System.out.println("Fibonacci numbers from 1 to " + val + " is:\n" + 1 );
		while (fib < val) {
			System.out.println(fib);
			fib = a1 + a2 ; 
			a1 = a2 ;
			a2 = fib ; 
		}
	}
}
