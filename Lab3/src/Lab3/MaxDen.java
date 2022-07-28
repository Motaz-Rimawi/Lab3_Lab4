package Lab3;

public class MaxDen {
	public static void main(String[] args) {
		int max = (int)(Math.random()*20);
		int den = (int)(Math.random()*20) + 1 ;
		
		System.out.println("Max equals: " + max + "\nDen equals: " + den);		
		for (int i = 0; i < max; i++) {
			if (i%den ==0)
				System.out.println(i);
		}
	}

}
