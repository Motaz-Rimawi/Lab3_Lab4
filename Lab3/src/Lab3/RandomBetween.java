package Lab3;

public class RandomBetween {
	public static void main(String[] args) {
		int val1 = (int)(Math.random()*20);
		int val2 = (int)(Math.random()*20);
		
		System.out.println("Value 1: " + val1 + "\nValue 2: " + val2);
		if (val1 > val2) 
			for (int i = val2 + 1 ; i < val1; i++) { // i incremented by one so we can print the numbers between 
													// the two values without the lower value 
				System.out.println(i);
			}
		else if(val2 > val1)
			for (int i = val1 + 1 ; i < val2; i++) { // i incremented by one so we can print the numbers between 
													// the two values without the lower value
				System.out.println(i);
			}
		else
			System.out.println("Values are equal so there is no numbers between them !");
	}

}
