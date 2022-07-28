package Lab3;

public class HelloWorldLoop {
	public static void main(String[] args) {
		String h = "Hello World"; 
		int j = 0 ; 
		
		System.out.println("Printing Hello World in an incremental for loop:");
		for (int i = 0; i <10 ; i++) {
			System.out.println(h);
		}
		
		System.out.println("\nPrinting Hello World in a decremental for loop:");
		for (int i = 10; i >0 ; i--) {
			System.out.println(h);
		}
		
		System.out.println("\nPrinting Hello World in an incremental while loop:");
		while (j<10) {
			System.out.println(h);
			j++;
		}
		
		// The value of j after the first while loop will become 10 so no need to initialize it again for the decremental while loop
		
		System.out.println("\nPrinting Hello World in a decremental while loop:");
		while (j>0) {
			System.out.println(h);
			j--;
		}
	
	}

}
