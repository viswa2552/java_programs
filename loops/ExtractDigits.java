//51.Java program to extract digits/ numbers from the string.

package com.advanced.loops;

public class ExtractDigits {
	
	public static void main(String[] args) {
		
		
		String a="0 1 2 3 4 5 6 !";
		String [] extraction =a.split("\\s");
		
		for(String extracting:extraction)
		{
			System.out.println(extracting);
		}


	}

}
