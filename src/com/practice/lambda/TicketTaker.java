package com.practice.lambda;

import java.util.function.IntUnaryOperator;

public class TicketTaker {
	private static int AT_CAPACITY = 100;

	public int takeTicket(int currentCount, IntUnaryOperator un) {
		return un.applyAsInt(currentCount);
	}

	public static void main(String[] args) {
		final TicketTaker bob = new TicketTaker();
		final int oldCount = 50;
		final int newCount = bob.takeTicket(oldCount, t -> {
			if (t > AT_CAPACITY) {

				throw new RuntimeException("Sorry , max has reached.");
			}

			return t + 1;

		});
		System.out.println(newCount);
	}

}
