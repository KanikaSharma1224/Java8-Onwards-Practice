package com.practice.random;

public class DayOfWeekEnum {
	public static void main(String[] args) {
		DayOfWeek day = DayOfWeek.MONDAY;
		System.out.println(DayOfWeek.MONDAY.ordinal());
	}

}

enum DayOfWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}