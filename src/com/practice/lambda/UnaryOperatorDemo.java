package com.practice.lambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		UnaryOperator<Integer> unOperator = (Integer i) -> i * 2;
		System.out.println(unOperator.apply(2));
	}

}
