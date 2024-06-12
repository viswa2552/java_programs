// 50.Java program to extract words from a given sentence
package com.advanced.loops;

public class ExtractWords {

	
	public static void main(String[] args) {
		
		
		String str="Hello viswa iam adi";
		
		String [] a =str.split("\\s");
		
		for(String extracts:a)
		{
			System.out.println(extracts);
		}
	}
}
