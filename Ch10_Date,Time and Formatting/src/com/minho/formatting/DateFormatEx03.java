package com.minho.formatting;

import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;

class DateFormatEx03 {
	public static void main(String[] args) {
		DateFormat df  = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			Date d = df.parse("2015년 11월 23일");
			System.out.println(df2.format(d));
		} catch(Exception e) {}
		
		LocalDate date = LocalDate.of(2020, 5, 1);
		System.out.println(date);
		
	} // main
}
