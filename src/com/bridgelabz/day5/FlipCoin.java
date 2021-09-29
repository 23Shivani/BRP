package com.bridgelabz.day5;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("flips:");
		int flips = scan.nextInt();
		
		System.out.println("head:");
		int head = scan.nextInt();
		 
	 flip(head, flips);
	 scan.close();
	}

	private static void flip(int head, int flips) {
		
		for (int i = 0; i < flips; i++) {
			if (Math.random() > 0.5) {
				head++;
				System.out.println(head);
				
			}
		}
		double percentofHeads = (head * 100) / flips;
		double percentofTails = 100 - percentofHeads;
		
		System.out.println("Tails % : " + percentofTails);
		System.out.println("Heads % : " + percentofHeads);
		 }
	 }