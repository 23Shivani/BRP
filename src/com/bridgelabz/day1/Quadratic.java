package com.bridgelabz.day1;

import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);
		double a,b ,c,root1, root2;

		System.out.println("Enter the values of a,b,c:");
		a= scanner.nextInt();
		b= scanner.nextInt();
		c= scanner.nextInt();

		double delta = ((b * b) - (4 * a * c));
		
		root1 = (-b + Math.sqrt(delta)) / (2 * a);
		root2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("First root is:" + root1);
		System.out.println("Second root is:" + root2);
		
	}

}
