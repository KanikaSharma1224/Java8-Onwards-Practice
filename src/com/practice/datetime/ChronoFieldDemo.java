package com.practice.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class ChronoFieldDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println("Era : " + today.get(ChronoField.ERA));
		System.out.println("Epoch Day : " + today.getLong(ChronoField.EPOCH_DAY));
		System.out.println("Year of Era : " + today.get(ChronoField.YEAR_OF_ERA));
		System.out.println("AMPM of Day : " + time.get(ChronoField.AMPM_OF_DAY));
		System.out.println("AMPM of Day : " + time.get(ChronoField.HOUR_OF_AMPM));
	}

}
