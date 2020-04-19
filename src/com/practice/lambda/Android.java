package com.practice.lambda;

import java.util.function.Supplier;

public class Android {
	public Android wakeUp(Supplier<Android> supplier) {
		return supplier.get();
	}
	
	public static void main(String[] args) {
		Android android = new Android();
		android.wakeUp(() -> new Android());
	}

}
