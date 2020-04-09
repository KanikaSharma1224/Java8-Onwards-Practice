package com.practice.lambda;

import java.util.function.BiConsumer;
import java.util.List;

public class BiConsumerDemo {
	public static void biConsume(int[] arr1, int[] arr2, BiConsumer<int[], int[]> bi) {
		bi.accept(arr1, arr2);
	}

	public static void main(String[] args) {
		BiConsumer<int[], int[]> biConsumer = (list1, list2) -> {
			for (int i = 0; i < list1.length; i++) {
				System.out.println(list1[i] + list2[i]);

			}
		};
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		biConsume(arr, arr2, biConsumer);

	}

}
