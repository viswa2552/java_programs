//19.Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
package BasicPrograms;

public class FirstandLastIndex {
	public static void main(String[] args) {
		String str = "Hello, world";
		System.out.println(str.indexOf('o'));
		System.out.println(str.lastIndexOf(','));
	}

}
