package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Dish {
	String name;
	boolean veg;
	int calories;
	DishType type;

	Dish(String name, boolean veg, int cal, DishType type) {
		this.name = name;
		this.veg = veg;
		calories = cal;
		this.type = type;
	}

	public boolean isVeg() {
		return this.veg;
	}

	public int getCalories() {
		return calories;
	}

	public DishType getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return name + " has " + calories + " calories.";
	}

	public static void main(String... args) {
		List<Dish> menu = Arrays.asList(new Dish("Seasonal Fruit", true, 120, DishType.OTHER),
				new Dish("prawns", false, 300, DishType.FISH), new Dish("hen", true, 280, DishType.MEAT),
				new Dish("rice", true, 350, DishType.OTHER), new Dish("chicken", false, 400, DishType.MEAT),
				new Dish("french fries", true, 530, DishType.OTHER));
		menu.stream().map(Dish::getName).map(String::length).forEach(dish -> System.out.println(dish));
	}

}

enum DishType {
	OTHER, MEAT, FISH
}