package com.bridgelabz.day2;

import java.util.Scanner;

public class IntOpt {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter value of a:\n");
	int a=scan.nextInt();
	System.out.println("Enter value of b:\n");
	int b=scan.nextInt();
	System.out.println("Enter value of c:\n");
	int c=scan.nextInt();
	System.out.println(a+b*c);
	System.out.println(a*b+c);
	System.out.println(c+a/b);
	System.out.println(a%b+c);

	}
}