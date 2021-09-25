package com.bridgelabz.day4;

import java.util.Scanner;

public class TemperatureConversion {
	
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Choose your conversions");
		System.out.println("Enter 1 for Celsius to fahrenheit and 2 for fahrenheit to Celsius");
		int temp=scan.nextInt();
		display(temp);  
	}

	static void display(int n)
	{
		if(n==1)
		{
			System.out.println("Enter Celsius value");
			int c=scan.nextInt();
			int f=(c*9/5)+32;
			System.out.println("fahrenheit = "+f);
		}
		else if(n==2)
		{
			System.out.println("Enter fahrenheit value");	
			int f=scan.nextInt();
			int c=(f-32)*5/9;
			System.out.println("Celsius = "+c);
				
		}
		else
		{
			System.out.println("Invalid Input! Please try again");
		}

	}

}