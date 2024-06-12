// 46.Reverse An Array Program.
package com.advanced.loops;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		
		
		int[] a= {1,2,3,4,5};
		
		System.out.println("The original Array value is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("The Array in the reverse order is :");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}

	}

}
