package com.bridgelabz.day9;

import java.util.Scanner;

public class StaticFactorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num:");
		int num = scan.nextInt();
		
		int fact = 1 ;
		for (int i=2; i<=num; i++) 
		{
			fact = fact*i;
		}
		System.out.println("Factorial : "+fact);
		scan.close();
	}
}