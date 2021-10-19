package com.bridgelabz.day10;
import java.util.Arrays;
import java.util.Collections;

public class MinMax {
	
	public static void main(String[] args) {
	      Integer[] numbers = { 8, 2, 7};
	      Integer maxint = (int) Collections.max(Arrays.asList(numbers));
	      Float[] num = {2.3f, 4.7f, 1.1f};
	      Float maxfloat = (float) Collections.max(Arrays.asList(num));
	      String[] fruits = {"Apple" ,"Watermelon", "Kiwi"};
	      int a = fruits[0].length();
	      int b = fruits[1].length();
	      int c = fruits[2].length();
	      if (a > b && a > c) {
	    	  System.out.println(fruits[0]);
	      }
	      else if (b > a && b > c) {
	    	  System.out.println(fruits[1]);
	      }
	      else {
	    	  System.out.println(fruits[2]);
	      }
	      
	      toPrint(maxfloat);	     
	      toPrint(maxint);
	   }
	private static void toPrint(Float maxfloat) {
		System.out.println(maxfloat);
		
	}

	private static void toPrint(Integer maxint) {
		System.out.println(maxint);
		
	}

}