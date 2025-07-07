package org.interview;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HCL2 {

	public static void main(String[] args) {
		String str = "innsssstttttrtanr";
		Map<Character, Long> map = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(map);

		System.out.println(map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get());
		
		System.out.println(map.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).get());
		
		
		
	}

}
