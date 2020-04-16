package com.practice.random;

import java.util.Scanner;

public class ReverseString {
	public String reverse(String input) {
		char[] arr = input.toCharArray();
		char temp;
		int i, j;
		for (i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return new String(arr);

	}

}
