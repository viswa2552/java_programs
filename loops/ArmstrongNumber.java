
// 52.Write a Java program to check if a number is Armstrong's number or not?.

package com.advanced.loops;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int a,b,sum=0,temp;
		System.out.println("Enter the number :");
		a=sc.nextInt();
		temp=a;
		while(a>0)
		{
			b=a%10;
			
			sum=sum+(b*b*b);
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("It is  armstrong number");
		}
		else 
		{
			System.out.println("It is not an armstrong number");
		}
		sc.close();

	}

}
