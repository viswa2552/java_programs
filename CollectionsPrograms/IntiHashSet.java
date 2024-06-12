//38.Write a program to initialize a HashSet in java?.

package com.CollectionsPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntiHashSet {
	
	public static void main(String[] args) {
	
			List<Integer> li = Arrays.asList(1,2,3,4,5);
		      
		      Set<Integer> set = new HashSet<>(li);
		      System.out.println(set);


		}
	
}


