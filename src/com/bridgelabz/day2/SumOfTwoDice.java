package com.bridgelabz.day2;

import java.util.Random;

public class SumOfTwoDice {
	
	public static void main(String[] args) {
	
	Random random=new Random();
	int a=random.nextInt(6) + 1;
	
	int b=random.nextInt(6) + 1;
	
	System.out.println("Sum Of Two Dice = " +(a+b));;

	}
}
