//13. Java Program to find Factorial using loops

package BasicPrograms;

import java.util.Scanner;

public class FactroialUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter value: ");
		int i, fact = 1;
		
		System.out.println("Enter looping value: ");
		int num  =sc.nextInt();
		
		for (i=0 ;i<=num; i++) {
			fact = fact*i;
			System.out.println("factorial of "+num+ " is:" +fact);
		}

	}

}
