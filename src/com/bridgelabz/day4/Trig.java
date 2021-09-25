package com.bridgelabz.day4;

import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any number to get sine value");
		int s=scan.nextInt();
		System.out.println("sin of "+s+"= "+Math.sin(s));

		System.out.println("Enter any number to get cos value");
		int c=scan.nextInt();
		System.out.println("cos of "+c+"= "+Math.cos(c));
		
		System.out.println("Enter degree to convert in radian");
		int r=scan.nextInt();
		System.out.println("Radian of "+s+"= "+Math.toRadians(r));
	}
}