package org.interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Infosys {

	public static void main(String[] args) {
		String str = "Drishti";
		str.chars().mapToObj(c -> (char) c).map(c -> new StringBuilder().reverse()).collect(Collectors.joining());
//String newSZ = IntStream.range(0, str.length()).mapToObj(i->String.valueOf(str.charAt(str.length()-i-1))).collect(Collectors.joining());
//	System.out.println(newSZ);

		String string = IntStream.range(0, str.length()).mapToObj(i -> String.valueOf(str.charAt(str.length() - i - 1)))
				.collect(Collectors.joining());
		System.out.println(string);
	
		
		int arr[] = {1,2,3,4,5,6};
		IntStream arrr = IntStream.rangeClosed(1,arr.length).map(i->arr[arr.length-i]);
		System.out.println(Arrays.toString(arrr.toArray()));
		
	}

//		
//		String str = "Drishti;
//				 String reversed = "";
//				        for (int i = str.length() - 1; i >= 0; i--) {
//				            reversed += str.charAt(i);  // Appending each character
//				        }
//				        return reversed;
//
//
//
//				str.chars().mapToObj(c->(char)c).map(c->new StringBuilder().reverse()).collect(Collectors.joining());
//				[i,t,h,s,i,r,D]
//
//
//
//
//
//				IntStream.range(0, input.length())
//				                                   .mapToObj(i -> String.valueOf(input.charAt(input.length() - i - 1)))
//				                                   .collect(Collectors.joining());
//	}

}
