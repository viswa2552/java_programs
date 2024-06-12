// 30.Write a program to traverse (or iterate) ArrayList?.

package com.CollectionsPrograms;

import java.util.Arrays;
import java.util.List;

public class Traverse {
	
	public static void main(String[] args) {
		
		
		List<Integer> a =Arrays.asList(1,2,3,4,5,6);
		
		for(int i=0;i<a.size();i++) {
			
			System.out.println(a.get(i)+" ");
		}

	}

}
