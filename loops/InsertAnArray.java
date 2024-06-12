
// 47.Insert An Element in Array.
package com.advanced.loops;

import java.util.Scanner;

public class InsertAnArray {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i,ele;
		int [] arr=new int[9];
		
		
		System.out.print("Enter 8 elements:");
		for(i=0;i<8;i++)
			arr[i]=sc.nextInt();
		
			System.out.println("Enter an element to insert:");
			ele=sc.nextInt();
			arr[i]=ele;
			System.out.println("The new Array is :");
			for(i=0;i<9;i++)
			
				System.out.println(arr[i]+" ");
	}
}
