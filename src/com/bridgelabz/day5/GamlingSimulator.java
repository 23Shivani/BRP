package com.bridgelabz.day5;

import java.util.Scanner;

public class GamlingSimulator {

	 public static void main(String[] args) {
	        Scanner cs = new Scanner(System.in);
	        System.out.println("Enter Stake : ");
	        int Stake = cs.nextInt();
	        System.out.println("Enter Goal : ");
	        int Goal = cs.nextInt();
	        System.out.println("Enter Number of Times : ");
	        int Trails = cs.nextInt();

	        int bets = 0;
	        int wins = 0;

	        for (int i=0;i<Trails;i++){
	            int cash = Stake;

	            while (cash > 0 && cash < Goal){
	                bets++;

	                if (Math.random() < 0.5)
	                    cash++;
	                else
	                    cash--;
	            }
	            if (cash == Goal)
	                wins++;
	        }
	        System.out.println(wins + " wins of " + Trails);
	        System.out.println("Percentage of games won = " + 100.0 * wins / Trails);
	        System.out.println("Avg. Number of bets  = " + 1.0 * bets / Trails);
	    }
}
