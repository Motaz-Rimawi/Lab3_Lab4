package Lab3;

public class Boom {
	public static void main(String[] args) {
		int val = (int)(Math.random()*100) + 1 ; 
		String s = String.valueOf(val);
		
		if (val%7 == 0)
			System.out.println("Boom !!");
		else if (s.contains("7"))
			System.out.println("Boom !!");
		else 
			System.out.println("Number equals: " + val);
	}

}
