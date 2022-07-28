package Lab3;

public class RandomOperations {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10001);
		// int num = 6 ; 
		int digits = 0 ; 
		int numClone = num;
		int temp = 0 ;
		int newNum = 0 ;
		int sum = 0 ;
		
		System.out.println("Random number equals: " + num);
		
		while(numClone > 0) {
			numClone = numClone / 10 ;
			digits++;
		}
		
		System.out.println("Number of digits equals: " + digits);
		System.out.println("The right digit of the number " +num+ " is: " + (num%10) ) ;
		System.out.println("The right digit of the number " +num+ " is: " + (int)(num/Math.pow(10, digits-1)) ) ;
		
		numClone = num ; 
		for (int i = 0; i < digits; i++) {
			temp = numClone % 10 ; 
			newNum = newNum + (int)(temp*Math.pow(10,digits-i-1));
			numClone = (int)numClone / 10 ; 
		}
		System.out.println("The opposite order of num " +num+ " is: " + newNum);
		
		numClone = num ; 
		for (int i = 0; i < digits; i++) {
			temp = numClone % 10 ; 
			sum = sum + temp ; 
			numClone = (int)numClone / 10 ; 
		}
		System.out.println("The sum of " +num+ " digits is: " + sum);
		
	}

}
