package com.iankovanov.homework1;

import java.time.LocalDateTime;

public class PrintCurrentDateAndTime {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}

}
