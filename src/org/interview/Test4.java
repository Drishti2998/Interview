package org.interview;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Test4 {

	public static void main(String[] args) {
		
		
		int arr[] = {1,66,56,4,6,7,10};
		//int max = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0 ; j<arr.length - i- 1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
					
				}
			}
		}

		
		System.out.println(arr[arr.length-2]);
		

	}

//	*
//	**
//	***
//	****
//	*****
	
//	for(int i = 0 ;i<5;i++) {
//		for(int j = 0;j<=i;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
}
