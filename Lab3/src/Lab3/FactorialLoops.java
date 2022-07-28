package Lab3;

public class FactorialLoops {
	public static void main(String[] args) {
		int val = (int)(Math.random()*7) + 1 ;
		int fac = 1 ; 
		int j = val ; 
		System.out.println("Value euqals: " + val);
		
		for (int i = val; i >0; i--) {
			fac = fac * i ; 
		}
		System.out.println("The factorial for value "+ val +" in decremental for loop is: " + fac);
		fac = 1 ;
		
		for (int i = 1; i <= val; i++) {
			fac = fac * i ; 
		}
		System.out.println("The factorial for value "+ val +" in incremental for loop is: " + fac);
		fac = 1 ;
		
		while (j > 0 ) {
			fac = fac * j ;
			j--;
		}
		System.out.println("The factorial for value "+ val +" in decremental while loop is: " + fac);
		fac = 1 ; 
		j=1 ; 
		
		while (j <= val ) {
			fac = fac * j ;
			j++;
		}
		System.out.println("The factorial for value "+ val +" in incremental while loop is: " + fac);

	}

}
