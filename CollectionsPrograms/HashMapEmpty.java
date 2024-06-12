//42.How to check if HashMap is empty?.

package com.CollectionsPrograms;

import java.util.HashMap;

public class HashMapEmpty {

	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> Hm = new HashMap<Integer,String>();
		
		Hm.put(1, "ADI");
		Hm.put(2, "VISWA");
		Hm.put(3, "VEERA");
		
		boolean result=Hm.isEmpty();
		
		System.out.println("The hashmap is empty? :"+" "+result);

	}

}
