//45.Reverse A Number In Java Program.
package com.advanced.loops;

public class ReverseAnumber {
	
	public static void main(String[] args) {
		
		
		int a = 12345, reverse = 0;  
		while(a != 0)   
		{  
		int remainder = a % 10;  
		reverse = reverse * 10 + remainder;  
		a = a/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse); 

	}


}
