// 37.Write a program to add elements to the HashMap given the key and value data type is String?.

package com.CollectionsPrograms;

import java.util.HashMap;

public class DtStringHashMap {
	
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> H=new HashMap<Integer,String>();
		
		H.put(1, "Aditya");
		H.put(2, "Sai");
		H.put(3,"Viswa");
		System.out.println("hashmap after adding elements:"+H);

	}


}
