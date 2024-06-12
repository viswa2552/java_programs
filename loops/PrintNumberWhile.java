// 49.Java program to print numbers from 1 to 10 using while loop.
package com.advanced.loops;

import java.util.Scanner;

public class PrintNumberWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st value :");
		int a = sc.nextInt();
		
		System.out.println("Enter lost value :");
		int b = sc.nextInt();
		
		while(a<b)
		{
			a++;
			System.out.println(a);

	}

}
}
