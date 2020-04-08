package com.practice.lambda;

public class Apple {
	int weight;
	AppleColor color;
	AppleCategory category;

	public Apple(int weight, AppleColor color, AppleCategory category) {
		this.weight = weight;
		this.color = color;
		this.category = category;
	}

	public int getWeight() {
		return weight;
	}

	public AppleColor getColor() {
		return color;
	}

	public AppleCategory getCategory() {
		return category;
	}

	public String toString() {
		return "A" + " " + color + " apple " + "of " + weight + " and " + " of this " + category;

	}

}
