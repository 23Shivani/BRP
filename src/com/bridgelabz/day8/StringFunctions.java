package com.bridgelabz.day8;

import java.util.Scanner;
import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {

// anagram detection
		int string = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String ");
		String string1 = sc.next();
		System.out.println("Enter second String ");
		String string2 = sc.next();
		
		int len1 = string1.length();
		int len2 = string2.length();
		
		//Method to check if the Strings are Anagram or not. 
		string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length()!=string2.length()){
            System.out.println("Not Anagram");
        }
        else {
            char[] Str1 = string1.toCharArray();
            char[] Str2 = string2.toCharArray();

            Arrays.sort(Str1);
            Arrays.sort(Str2);

            if (Arrays.equals(Str1,Str2) == true)
                System.out.println("Both the strings are anagram");
            else
                System.out.println("Both the string are not anagram");
        }

//Palindrome Checking
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the String for check:");
            String string3 = scanner.nextLine();
            
            if(isPal(string3))
                System.out.println(string3 + " is a palindrome");
            else
                System.out.println(string3 + " is not a palindrome");

	}
			public static boolean isPal(String s)
		    {   
		        if(s.length() == 0 || s.length() == 1)
		            return true; 
		        if(s.charAt(0) == s.charAt(s.length()-1))
		        
		        return isPal(s.substring(1, s.length()-1));
		
		        
		        return false;
		    }
}
