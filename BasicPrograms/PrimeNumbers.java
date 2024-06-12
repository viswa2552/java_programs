//29.Write a Java program to compute the sum of the first 100 prime numbers.

package BasicPrograms;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting Prime no :"); 
		int count = sc.nextInt();
		
		System.out.println("Enter Ending Prime no :"); 
		int sum = sc.nextInt();  
		
		for(int digit = 1; digit <= 100; digit++)
		{
			count = 0;  
			for (int i = 2; i <= digit/2; i++)  
			{  
			  
			if(digit % i == 0)  
			{  
			  
			count++;  
			break;  
			}    
			}   
			  
			if(count == 0 && digit != 1 )  
			{  
			    
			sum = sum + digit;  
			}    
			}  
			
			System.out.println("The Sum of Prime Numbers  is: " + sum); 


	}

}
