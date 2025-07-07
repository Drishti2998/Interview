package org.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
	public static void main(String[] args) {
		String parentString = "My Name is something and then Name not nothing";
		String subString = "Name";
		int index = parentString.indexOf(subString); // Find the first occurrence
		while (index != -1) {
			System.out.println("Found at index: " + index); // Print the index
			index = parentString.indexOf(subString, index + 1); // Find the next occurrence
		}

		
		
//		List<Integer> list = new ArrayList<Integer>();
//		int temp = 0;
//		String strList[] = parentString.split(" ");
//		for (String str : strList) {			
//			if(str.equals(subString)) {
//				list.add(temp);
//			}
//			temp = temp + str.length()+1;
//		}
//		System.out.println(list);
	}
	
	
}
