package com.bridgelabz.day9;

import java.util.Scanner;

public class HarmonicReturn {

		public static double numHarmonic(double n) {
			 double H0 = 0;
			 while(n>0) {
			 H0 = (H0+(1/(n+1)));
			 n--;
//			 System.out.print(" "+H0);
			 }
			 return H0;
		 }

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of n ");
			double n=sc.nextInt();
			System.out.println("Harmonic value is: "+numHarmonic(n));

		}

}