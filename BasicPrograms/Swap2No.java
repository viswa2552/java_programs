//3.Java Program to Swap Two Numbers.

package BasicPrograms;

import java.util.Scanner;

public class Swap2No {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("enter the values of a :");
		a=sc.nextInt();
		
		System.out.println("enter the values of b : ");
		b=sc.nextInt();
		
		System.out.println("Numbers before swapping:"+" "+a+" "+b);
		c=a;
		a=b;
		b=c;
		
		System.out.println("Number after swapping:"+" "+a+" "+b);
		sc.close();

	}

	}


