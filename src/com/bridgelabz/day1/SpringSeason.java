package com.bridgelabz.day1;

import java.util.Scanner;

public class SpringSeason {

		public static void main(String[] args) {
			  Scanner scan = new Scanner(System.in);

		        System.out.println("Enter Month : ");
		        int month = scan.nextInt();
		        System.out.println("Enter Day : ");
		        int day = scan.nextInt();
		        
		        if(month == 3 && day >= 20) {
		        	System.out.println("Yeah! It's Spring Season");
		        }
		        else if ((month == 4 || month ==5) && (day <= 30 && day != 0)){
		            System.out.println("Yeah! It's Spring Season");
		        }
		        else if (month == 6 && day <= 20){
		            System.out.println("Yeah! It's Spring Season");
		        }
		        else
		            System.out.println("Invalid Input!");

		}

}