package com.practice.lambda;

import java.util.function.UnaryOperator;

public class Doll {
	private int layer;

	public Doll(int layer) {
		this.layer = layer;
	}

	public static void open(Doll doll, UnaryOperator<Doll> task) {
		while ((doll = task.apply(doll)) != null) {
			System.out.println("X");
		}
	}

	public static void main(String[] args) {
		Doll newDoll = new Doll(5);
		open(newDoll, (d) -> {
			if (d.layer <= 1)
				return null;
			else
				return new Doll(d.layer--);
		});

	}

}
