// 41.Write a program to get size of HashMap?.

package com.CollectionsPrograms;

import java.util.HashMap;

public class SizeHashMap {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> Hm = new HashMap<Integer,String>();
		
		Hm.put(1, "ADI");
		Hm.put(2, "VISWA");

		System.out.println(Hm.size());


	}

}
