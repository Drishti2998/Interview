package org.interview;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,5,6};

		int newArr[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (k < newArr.length) {
			if (i < arr1.length && j < arr2.length) {
				if (arr1[i] < arr2[j]) {
					newArr[k] = arr1[i];
					i++;
					k++;
				} else if (arr1[j] < arr2[i]) {
					newArr[k] = arr2[j];
					j++;
					k++;
				}else{
					newArr[k]=arr1[i];
					newArr[++k]=arr2[j];
					i++;
					j++;
					k++;
				}
			}else if(i<arr1.length && j>=arr2.length) {
				newArr[k] = arr1[i];
				k++;
				i++;
			}else if(j<arr2.length && i>=arr1.length) {
				newArr[k] = arr2[j];
				k++;
				j++;
			}
		}

		System.out.println(Arrays.toString(newArr));
	}

}
