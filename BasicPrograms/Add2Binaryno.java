package BasicPrograms;

public class Add2Binaryno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="1010"; 
		String s2="0101";
		
		System.out.println(add_digits(s1,s2));

	}
	static String add_digits(String s1,String s2)
	{
		int n1=Integer.parseInt(s1,2);
		int n2=Integer.parseInt(s2,2);
		int sum=n1+n2;
		String result=Integer.toBinaryString(sum);
		return result;

	}

}
