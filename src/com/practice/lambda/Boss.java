package com.practice.lambda;

import java.util.List;
import java.util.ArrayList;

public class Boss {
	private String name;

	public Boss(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return getName();
	}

	public static void main(String[] args) {
		final List<Boss> list = new ArrayList<>(8);
		list.add(new Boss("Jane"));
		list.add(new Boss("Ted"));
		list.add(new Boss("Grace"));
		list.removeIf(s -> s.getName().equalsIgnoreCase("ted"));
		System.out.println(list);

	}

}
