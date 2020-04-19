package com.practice.lambda;
import java.util.function.Function;
import java.util.List;

public class FindMovie {
	private Function<String, String> printer;
	protected FindMovie() {
		printer = p -> {
			System.out.println(p);
			return p;
		};
	}
	void printMovies(List<String> movies) {
		//movies.forEach(printer);
	}
	

}
