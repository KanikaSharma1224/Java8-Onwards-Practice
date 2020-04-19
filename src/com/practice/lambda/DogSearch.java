package com.practice.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class DogSearch {
	void reduceList(List<String> names, Predicate<String> tester) {
		names.removeIf(tester);

	}

	public static void main(String[] args) {
		int MAX_LENGTH = 2;
		DogSearch search = new DogSearch();
		List<String> list = new ArrayList<>();
		list.add("Lassie");
		list.add("Benji");
		list.add("Brian");
		//MAX_LENGTH += list.size();
		search.reduceList(list, d -> d.length() > MAX_LENGTH);
		System.out.print(list.size());

	}

}
