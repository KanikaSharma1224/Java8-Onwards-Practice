package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class SquaresOfNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().map(i -> i * i).forEach(num -> System.out.println(num));
	}

}
