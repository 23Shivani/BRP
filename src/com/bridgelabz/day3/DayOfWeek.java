package com.bridgelabz.day3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

	public class DayOfWeek {
		
		public static int method(int year, int month, int day) {
			
			int[] dateArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			if (year > 0 && (month > 0 && month <= 12)) {

				if ((year % 4 == 0 || year % 400 == 0) && month == 2 && (day > 0 && day <= 29)) {

					Calendar calendar = new GregorianCalendar(year, month - 1, day);
					return calendar.get(Calendar.DAY_OF_WEEK);
				} else {

					if (day > 0 && day <= dateArray[month - 1]) {

						Calendar calendar = new GregorianCalendar(year, month - 1, day);
						return calendar.get(Calendar.DAY_OF_WEEK);
					} else
						return 0;
				}
			} else
			return 0;
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] dayofweek = { " Invalid input! ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int yyyy, mm, dd;
		System.out.println("Enter Year: ");
		yyyy = scan.nextInt();
		System.out.println("Enter Month: ");
		mm = scan.nextInt();
		System.out.println("Enter Day: ");
		dd = scan.nextInt();
		scan.close();
		System.out.println("Day Of Week is : " + dayofweek[method(yyyy, mm, dd)]);
		}

}