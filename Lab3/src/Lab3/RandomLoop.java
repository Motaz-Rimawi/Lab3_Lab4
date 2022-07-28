package Lab3;


public class RandomLoop {
	public static void main(String[] args) {
		
		int val = (int)(Math.random()*20);
		
		System.out.println("the Value is: " + val);
		for (int i = 1; i <= val; i++) {
			System.out.println(i);
		}

	}
}
