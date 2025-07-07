package org.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LTI {
	public static void main(String[] args) {
		String str = "insidecircle";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
		System.out.println(map);
		
		System.out.println(map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).findFirst().get());	

		System.out.println(map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).filter(entry->entry.getValue()>1)
				.findFirst().get());
		
		System.out.println(map.entrySet().stream().filter(entry->entry.getValue()>1).min(Comparator.comparing(Map.Entry::getValue)).get());
		
		List<Integer> num = Arrays.asList(1,0,1,0,1,1,1,0,0);
		System.out.println(num.stream().sorted().collect(Collectors.toList()));
		
	}

}
