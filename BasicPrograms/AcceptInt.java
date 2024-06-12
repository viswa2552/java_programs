//23.Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

package BasicPrograms;

import java.util.Scanner;

public class AcceptInt {
	
	public static void main(String[] args) {
		//23.Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
		 Scanner sc = new Scanner(System.in);
		int n;
		char a, b, c;
		
		  System.out.print("Enter value: ");
		  n = sc .nextInt();
		  
		  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);


	}

}
