package com.practice.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleDriver {
	public static List<Apple> getApples() {
		List<Apple> list = new ArrayList<>();
		list.add(new Apple(160, AppleColor.CHERRY, AppleCategory.CHERRY_DELICIOUS));
		list.add(new Apple(160, AppleColor.GREEN, AppleCategory.GOLDEN_DELICIOUS));
		list.add(new Apple(150, AppleColor.RED, AppleCategory.CHERRY_DELICIOUS));
		list.add(new Apple(170, AppleColor.GREEN, AppleCategory.GOLDEN_DELICIOUS));
		list.add(new Apple(150, AppleColor.YELLOW, AppleCategory.RED_DELICIOUS));
		list.add(new Apple(160, AppleColor.GREEN, AppleCategory.CHERRY_DELICIOUS));

		return list;
	}
	public static List<Apple> filterApple(List<Apple> apples, Predicate<Apple> p) {
		List<Apple> filteredApple = new ArrayList<>();
		for(Apple apple : apples) {
			if(p.test(apple)) {
				filteredApple.add(apple);
			}
		}
		return filteredApple;
	}
	
	public static void display(List<Apple> apples) {
		for(Apple apple : apples) {
			System.out.println(apple);
		}
	}
	
	public static void main(String[] args) {
		List<Apple> listOfApples = getApples();		
		List<Apple> heavyApple = filterApple(listOfApples, (Apple apple) -> apple.getWeight() == 160);		
		System.out.println("Heavy Apples ");
		display(heavyApple);
		List<Apple> greenApple = filterApple(listOfApples, (Apple apple) -> "GREEN".equals(apple.getColor().name()));
		System.out.println("Green Apples");
		display(greenApple);
		
	}

}
