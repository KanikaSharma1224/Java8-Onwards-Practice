package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World");
		List<String[]> chars = words.stream().map(word -> word.split("")).collect(toList());
		System.out.println(chars);
	}

}
