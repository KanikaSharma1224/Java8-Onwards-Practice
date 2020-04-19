package com.practice.lambda;

import java.util.function.BinaryOperator;

public class Magician {
	public Long magic(BinaryOperator<Long> biOp) {
		return biOp.apply(3L, 7L);
	}

	public static void main(String[] args) {
		Magician magician = new Magician();
		long res = magician.magic((Long d, Long r) -> 
			r + d);
		System.out.println(res);
	}

}
