package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Kanika", "Sharma", "Ashu", "Saxena");
		words.stream().map(String::length).forEach(w -> System.out.println(w));
	}

}
