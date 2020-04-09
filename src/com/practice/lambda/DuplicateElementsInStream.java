package com.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;

public class DuplicateElementsInStream {
	public static <T> Set<T> findDuplicateBySet(List<T> list) {
		Set<T> set = new HashSet<>();
		return list.stream().filter((n) -> !set.add(n)).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 5, 9, 6, 6, 11, 3, 4, 4);

		Set<Integer> res = findDuplicateBySet(list);

		res.forEach(System.out::println);

	}

}
