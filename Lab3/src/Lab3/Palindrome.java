package Lab3;

public class Palindrome {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100001);
		int digits = 0 ; 
		int numClone = num ; 
		int temp = 0 ; 
		int newNum = 0 ; 
		
		while(numClone > 0) {
			numClone = numClone / 10 ;
			digits++;
		}
		
		numClone = num ; 
		
		for (int i = 0; i < digits; i++) {
			temp = numClone % 10 ; 
			newNum = newNum + (int)(temp*Math.pow(10,digits-i-1));
			numClone = (int)numClone / 10 ; 
		}
		System.out.println("The original num equals: " + num + " and the reversed num equals: " + newNum);
		if (num == newNum)
			System.out.println("Palindrome !! ");
		else 
			System.out.println("Not A Palindrome !!");
	}

}
