package com.bridgelabz.day9;

import java.util.Scanner;

public class FutureValue {

		public static void value(int c, int r, int t) {
			double result=0;
			result=Math.pow(c*(1+r),t);
			System.out.println("future value is "+result);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter investment value in $");
			int a1 = sc.nextInt();
			System.out.println("Enter rate");
			int a2 = sc.nextInt();
			System.out.println("Enter timeperiod");
			int a3 = sc.nextInt();
			value(a1,a2,a3);

	}

}
