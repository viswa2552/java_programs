
//1.Java Program to Get Input from the User. int , float , double

package BasicPrograms;

import java.util.Scanner;
public class IntFloatDoouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter an int: ");
		 int intgerInput = sc.nextInt();
		 
		 System.out.println("Enter an float: ");
		 float floatInput = sc.nextFloat();
		 
		 System.out.println("Enter an double: ");
		 double doubleInput = sc.nextDouble();
		 
		 System.out.println("Integer Entered" + intgerInput);
		 System.out.println("Float Entered" + floatInput);
		 System.out.println("Doubled Entered" + doubleInput);

	}

}
