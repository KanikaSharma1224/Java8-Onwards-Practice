package com.practice.lambda;

import java.util.function.Predicate;

public class LifeGuard {
	private void saveLife(Predicate<Tourist> canSave, Tourist tourists) {
		System.out.println(canSave.test(tourists) ? "saved" : "too far");
	}

	public static void main(String[] args) {
		Tourist tourist = new Tourist(3);
		LifeGuard saver = new LifeGuard();
		saver.saveLife((t) -> t.distance < 4, tourist);
	}

}
