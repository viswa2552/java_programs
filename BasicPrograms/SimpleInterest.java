
// 8. Java Program to calculate simple interest

package BasicPrograms;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				
				int Pr,T,R,SI;
				System.out.println("Principal Amount :");
				
				Pr= sc.nextInt();
				
				System.out.println("How many months :");
				T=sc.nextInt();
				System.out.println("Annual Rate  :");
				R=sc.nextInt();
				
				SI =(Pr*T*R)/100;
				System.out.println("The Simple intrest is:"+SI);
				
	}

}
