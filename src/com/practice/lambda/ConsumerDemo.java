package com.practice.lambda;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static <T> void consume(T t, Consumer<T> c) {
		c.accept(t);
	}

	public static void main(String[] args) {
		Consumer<Apple> consumer = (apple) -> System.out.println(apple);
		Consumer<Employee> consumer2 = (e) -> System.out.println(e);

		consume(new Apple(200, AppleColor.CHERRY, AppleCategory.RED_DELICIOUS), consumer);
		consume(new Employee("Kanika", "SSharma", 36, "Software Developer"), consumer2);
	}

}
