	//25.Write a Java program to print the odd numbers from 1 to 20.

package BasicPrograms;

import java.util.Scanner;

public class OddNumbers {
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value :");
		 int no = sc.nextInt();
		
		for(int a=1;a<=no;a++)
		{
			if(a%2!=0)
			{
				System.out.println(a+" ");
			}
		

	}
	}

}
