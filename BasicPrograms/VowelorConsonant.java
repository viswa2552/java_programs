// 7. Java Program to check whether input character is vowel or consonant

package BasicPrograms;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Enter char: ");
				
				char x=sc.next().charAt(0);
				vowel_Consonent(x);
				sc.close();

			}
			static void vowel_Consonent(char x)
			{
				if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
				{
					System.out.println("The given char is a vowel");
				}
				else
				{
					System.out.println("The given char is a Consonant");
				}
	}

}
