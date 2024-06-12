// 28.Write a Java program to convert seconds to hour, minute and seconds.

package BasicPrograms;

import java.util.Scanner;

public class ConvertHtoM {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the seconds: ");
        int seconds = sc.nextInt();
        
        int sec = seconds % 60;
        
        int hour = seconds / 60;
        
        int min = hour % 60;
        
        hour = hour / 60;
        
        System.out.println( hour + ":" + min + ":" + sec);
        
        sc.close();

	}

}
