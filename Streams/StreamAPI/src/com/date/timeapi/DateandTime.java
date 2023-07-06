package com.date.timeapi;
import java.time.*;
public class DateandTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: "+date);
		LocalTime time = LocalTime.now();
		System.out.println("Current Time: "+time);
		int dd = date.getDayOfMonth();
		System.out.println("Current Day: "+dd);
		int mm = date.getMonthValue();
		System.out.println("Current Month: "+mm);
		long yyyy = date.getYear();
		System.out.println("Current Year: "+yyyy);
		int min = time.getMinute();
		System.out.println("Current Minute: "+ min);
		int hour = time.getHour();
		System.out.println("Current Hour: "+hour);
		int sec = time.getSecond();
		System.out.println("Current Seconds: "+sec);
	}
}
