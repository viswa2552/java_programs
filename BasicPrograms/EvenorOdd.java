// 6.Java Program to Check Even or Odd Integers.

package BasicPrograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter value :");
		
		int num = sc.nextInt();
		eveodd(num);
		
	}
	public static int eveodd(int num)
	{
		if (num%2 == 0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is odd");
		}
		
		
		return 0;
		
	}

}
