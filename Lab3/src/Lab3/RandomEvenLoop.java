package Lab3;

public class RandomEvenLoop {
	public static void main(String[] args) {
		int val = (int)(Math.random()*20);
		
		System.out.println("Value equals: " + val);
		for (int i = 0; i <= val; i++) {
			if(i%2 == 0)
				System.out.println(i);
			
		}
	}

}
