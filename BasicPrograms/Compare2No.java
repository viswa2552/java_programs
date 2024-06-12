//20.Write a Java program to compare two numbers
package BasicPrograms;

import java.util.Scanner;

public class Compare2No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st value: ");
		int a= sc.nextInt();
		System.out.println("Enter 2nd value: ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a+ " is big");
		}
		else {
			System.out.println("Compare two numbers: " +b+ " is big");
		}
		
	}

}
