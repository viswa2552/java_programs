//12. Java program to convert double to String

package BasicPrograms;

import java.util.Scanner;

public class DoubleToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		double a = sc.nextDouble();
		String str = String.valueOf(a);
		System.out.println(str);

	}

}
