package com.bridgelabz.day9;

import java.util.Scanner;

public class ReturnHarmonic {

	public static double harmonicNumber(double n) {
		 double h0 = 0;
		 while(n>0) {
			 h0 = (h0+(1/(n+1)));
			 n--;
		 System.out.println(" "+h0);
		 }
		 return h0;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		double n=sc.nextInt();
		System.out.println("The harmonic series is : ");
		System.out.println(" harmonic is: "+ harmonicNumber(n));

	}

}