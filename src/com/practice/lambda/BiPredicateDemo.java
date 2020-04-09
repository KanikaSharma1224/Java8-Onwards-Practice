package com.practice.lambda;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<String, Integer> biPredicate = (String x, Integer y) -> {
			return x.length() == y;
		};

		Boolean result = biPredicate.test("mango", 5);
		System.out.println(true);
	}

}
