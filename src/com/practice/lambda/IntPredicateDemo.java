package com.practice.lambda;

import java.util.function.IntPredicate;

public class IntPredicateDemo {
	public static void main(String[] args) {
		IntPredicate inPredicate = (int i) -> i > 10;
		System.out.println(inPredicate.test(15));

	}

}
