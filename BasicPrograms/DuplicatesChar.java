//9. Java Program to find duplicate characters in a String

package BasicPrograms;

public class DuplicatesChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count;
		
		String a="Hello Iam Aditya";
		
		char String[]=a.toCharArray();
		
		System.out.println("The String is: "+a);
	
		System.out.print("The duplicate characters in string are:");
		for(int i=0;i<a.length();i++)
		{
		count=1;
			for(int j=i+1;i<a.length();j++)
			{
				if(String[i] == String[j])
				{
					System.out.println(String[j]+" ");
					break;
				}
			}
			System.out.print("the duplicate characters in string are:");
		}


	}

}
