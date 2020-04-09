package com.practice.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThenFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> biFunc = (i1, i2) -> Math.pow(i1, i2);
		System.out.println(biFunc.apply(2, 5));

		Function<Double, String> func = (d) -> "Result : " + String.valueOf(d);
		String str = biFunc.andThen(func).apply(2, 5);
		System.out.println(str);

	}

}
