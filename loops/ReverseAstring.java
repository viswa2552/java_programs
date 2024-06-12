//43.Reverse A String In Java.
package com.advanced.loops;

public class ReverseAstring {
	
	public static void main(String[] args) {
		
		
		String str="viswa";
		
		char ch[]=str.toCharArray();
		
		String reverse="";
		
		for(int i=ch.length-1;i>0;i--)
		{
			reverse+=ch[i];
		}
		System.out.println(reverse);

	}


}
