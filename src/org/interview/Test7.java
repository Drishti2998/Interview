package org.interview;

public class Test7 {

	public static void main(String[] args) {
		int arr[] = { 1, 66, 56, 10, 98, 16, 7 };
		
		int first = 0;
		int second = 0;
		if(arr[0]>=arr[1]) {
			first = arr[0];
			second = arr[1];
		}else {
			first = arr[1];
			second = arr[0];
		}
		for(int i = 2 ;i<arr.length;i++) {
			if(arr[i]>first && arr[i]>second) {
				second = first;
				first = arr[i];
			}else if(arr[i]<first && arr[i]>second) {
			   second = arr[i];	
			}
		}

		System.out.println("first: "+first + " ,Second: "+second);
	}

}
