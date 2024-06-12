// 14.Write a program to print a string entered by user.

package BasicPrograms;

import java.util.Scanner;

public class StringEnterd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		System.out.println("The string enterd by user: " +str);

	}

}
