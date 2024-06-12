//21.Write a Java program to count the letters, spaces, numbers and other characters of an input string
package BasicPrograms;

import java.util.Scanner;

public class CountStringAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		count(str);
	}
public static void count(String x) {
	char []ch = x.toCharArray();
	int letters = 0;
	int spaces = 0;
	int num = 0;
	int otherchat = 0;
	
	for(int i = 0; i < x.length(); i++) {
		if(Character.isLetter(ch[i])) {
			letters++ ;
		}
		else if(Character.isDigit(ch[i])) {
			num++ ;
		}
		else if(Character.isSpaceChar(ch[i])) {
			spaces++ ;
		}
		else {
			otherchat++ ;
		}
	}
	
//	System.out.println("The string is: \' hi Viswa " );
//	System.out.println("Letters: " + letters+ " spaces: " +spaces+ " numbers: " +num+ " other: " +otherchat);
	System.out.println("Letters: " + letters);
	System.out.println("Spaces: " + spaces);
	System.out.println("Numbers: " + num);
	System.out.println("Other characters: " + otherchat);
}
}
