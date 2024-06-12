//This Java Pyramid example shows how to generate pyramid or triangle
package com.advanced.loops;

import java.util.Scanner;

public class Pyramid {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Value :");
		 int r= sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
