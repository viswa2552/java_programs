//10. Java Program to Calculate average of numbers using Array

package BasicPrograms;

public class CalAvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {10,0,2,5,20};
		float sum = 0;
		int i = 0;
		while(i<num.length) {
			sum+= num[i];
			
			i++;
		}
		float average = (sum/num.length);
		System.out.println("The total average is: " + average);

	}

}
