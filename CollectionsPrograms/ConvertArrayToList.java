// 35.Write a program to convert Array to List?.

package com.CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	
	
	public static void main(String[] args) {
		
		
		String arr[] = { "Aditya", "prudhvi","sai","mani"};   
		 
		System.out.println("Array before conversion: "+ Arrays.toString(arr));   
		
		List<String> list = ArrayToListConversion(arr);   
		 
		System.out.println("Array List: " + list);   
		}       
		 
		public static <Test> List<Test> ArrayToListConversion(Test array[])   
		{   
	  
		List<Test> list = new ArrayList<>();   
		
		for (Test t : array)   
		{   
		
		list.add(t);   
		}   
	 
		return list;   
}
		
}
