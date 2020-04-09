package com.practice.lambda;

import java.util.function.BinaryOperator;

public class BiOperatorDemo {
	public static void main(String[] args) {
		BinaryOperator<Integer> biOperator = (Integer i1, Integer i2) -> i1 + i2;
		System.out.println(biOperator.apply(2, 3));

	}

}
