package com.practice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo2 {

	public static <Integer> List<Integer> multiplier(List<Integer> list, UnaryOperator<Integer> u) {
		List<Integer> lst = new ArrayList<>();
		for (Integer i : list) {
			lst.add(u.apply(i));
		}
		return lst;
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> newList = multiplier(integerList, (x) -> x * 3);
		newList.stream().forEach((a) -> System.out.print(a + " "));

	}

}
