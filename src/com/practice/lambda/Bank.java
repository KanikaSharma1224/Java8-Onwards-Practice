package com.practice.lambda;

import java.util.function.DoubleToIntFunction;

public class Bank {
	private int savingsInCents;

	private static class ConvertToCents {
		//static DoubleToIntFunction f = (p) -> p * 100;

	}

	public static void main(String[] args) {
		Bank creditUnion = new Bank();
		creditUnion.savingsInCents = 100;
		double depoists = 1.5;
		//creditUnion.savingsInCents += ConvertToCents.f.applyAsInt(depoists);
		System.out.println(creditUnion.savingsInCents);

	}

}
