package Lab3;

import java.util.Hashtable;

public class Strings {
	public static void main(String[] args) {
		char[] arr = {'a','b','c','a','b','d','r','c'};
		String name = "John Bryce";
		String str = "Sara Shara Shir Cameach";
		int aCount = 0 ; 
		int cCount = 0 ; 
		int hCount = 0 ; 
		int vowelCount = 0 ; 
		Hashtable<String,Integer> h = new Hashtable();
		h.put("a",0);h.put("u",0);h.put("e",0);h.put("i",0);h.put("o",0);
		
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] == 'a')
				aCount++  ; 
			if (arr[i] == 'c')
				cCount++  ; 
		}
		System.out.println("The array have " +aCount+ " 'A' letters and a " + (aCount+cCount) + " 'A & C' letters");
		
		char [] arr1 = name.toLowerCase().toCharArray();
		for (int i = 0; i <arr1.length; i++) {
			if (arr1[i] == 'h')
				hCount++  ; 
		}
		System.out.println("The array have " +hCount+ " 'H' letters");
		
		char [] arr2 = str.toLowerCase().toCharArray();
		for (int i = 0; i <arr2.length; i++) {
			if (h.containsKey(String.valueOf(arr2[i])))
				vowelCount++  ; 
		}
		System.out.println("The String have " +vowelCount+ " vowel letters");
		
	}

}
