package com.practice.lambda;

import java.util.function.DoubleSupplier;

public class DoubleSupplierDemo {
	public static void main(String[] args) {
		DoubleSupplier supplier = () -> {
			return 420;
		};

		System.out.println(supplier.getAsDouble());
	}

}
