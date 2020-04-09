package com.practice.lambda;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.List;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (i1, i2) -> i1 * i2;
		System.out.println(biFunction.apply(2, 6));

		BiFunction<Integer, Integer, List<Integer>> biFunction2 = (i1, i2) -> Arrays.asList(i1, i2);
		System.out.println(biFunction2.apply(2, 5));
	}

}
