// 32.Given an element write a program to check if element exists in HashSet?.

package com.CollectionsPrograms;

import java.util.HashSet;

public class ValueExit {

	public static void main(String[] args) {
		
		
		HashSet H = new HashSet();
		
		H.add("5");
		H.add("10");
		H.add("15");
		H.add("20");
		
		System.out.println("set ="+H);
		
		System.out.println("is number 20 contains in a set?"+"  "+H.contains("20"));

	}
}
