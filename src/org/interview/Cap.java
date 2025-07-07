package org.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cap {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		int sum = num.stream().reduce(Integer::sum).get();
		System.out.println(sum);

		String str = "Java is funny Language and I love java";

		System.out.println(str.chars().mapToObj(ch -> (char) ch).filter(c -> !c.equals(' '))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting())));

		System.out.println(str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		String str2 = "apple banana apple";
		System.out.println(Arrays.asList(str2.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		List<String> str3 = Arrays.asList("apple banana apple", "banana cherry apple", "date banana cherry",
				"apple cherry");

		System.out.println(str3.stream().flatMap(a -> Stream.of(a.split("\\s+")))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		System.out.println(Arrays.stream(str3.stream().collect(Collectors.joining(" ")).split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
	}

}
