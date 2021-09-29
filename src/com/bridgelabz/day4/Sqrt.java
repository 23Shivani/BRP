package com.bridgelabz.day4;

import java.util.Scanner;

public class Sqrt {


	static double square(double c, double l){
        double t = c;
        double root;
        int count = 0;
        while (true){
            count++;
            root = 0.5 * (t +(c / t));
            if (Math.abs(root-t) < 1)
                break;
            t = root;
        }
        return root;
    }
	
	public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double c,l;
        System.out.println("Enter Value of c");
        c=cs.nextDouble();
        System.out.println("Enter Value of l ");
        l=cs.nextDouble();
        System.out.println(square(c,l));
    }
	
}