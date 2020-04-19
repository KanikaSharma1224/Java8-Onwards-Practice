package com.practice.lambda;

import java.util.function.Supplier;

public class SupplierGenericDemo {
	public static void main(String[] args) {
		Supplier<Double> supplier = () -> {
			return 420.0;
		};
		System.out.println(supplier.get());
	}

}
