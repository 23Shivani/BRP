package com.bridgelabz.day1;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 names");
		
		String name1,name2,name3;
		Scanner sc=new Scanner(System.in);
		
		name1=sc.nextLine();
		name2=sc.nextLine();
		name3=sc.nextLine();
		
		System.out.println("Hi "+name3+" ,"+name2+" and "+name1);
        sc.close();
	}
}
